package com.example.au.couchbasedemo.model;

import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import com.sun.istack.NotNull;

@Document
public class FootBall {
    
    

	@Field
    String country;
    
    @Field
    int position;
    
    @Field
    int goalsScored;
    
    @Field
    String id;
    
    
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public FootBall(String country, int position, int goalsScored) {
		super();
		this.country = country;
		this.position = position;
		this.goalsScored = goalsScored;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getGoalsScored() {
		return goalsScored;
	}

	public void setGoalsScored(int goalsScored) {
		this.goalsScored = goalsScored;
	}
    
    
    
    
}
