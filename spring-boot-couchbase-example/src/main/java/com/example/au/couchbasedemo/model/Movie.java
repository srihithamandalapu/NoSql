package com.example.au.couchbasedemo.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import com.sun.istack.NotNull;

@Document
public class Movie {
    
    @Id
    String id;
    
    @NotNull
    @Field
    List<String> cityName;
    
    @NotNull
    @Field
    String movieName;
    
    @Field
    int rating;
    
    public Movie(String id, String movieName, List<String> cityName , int rating) {
		this.id = id;
		this.movieName = movieName;
		this.cityName = cityName;
		this.rating = rating;
		
	}
    

	public String getMovie() {
		return movieName;
	}

	public void setMovie(String movieName) {
		this.movieName = movieName;
	}

	public List<String> getCityName() {
		return cityName;
	}

	public void setCityName(List<String> cityName) {
		this.cityName = cityName;
	}

	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getId() {
		return id;
	}

	
    
    
}
