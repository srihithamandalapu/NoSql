package com.example.au.couchbasedemo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.au.couchbasedemo.model.Blogs;
import com.example.au.couchbasedemo.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, String> {
	
	Movie findByMovieName(String movie);
	Movie findByID(String id);

	List deleteByMovieName(String cityName, String movieName);

	Movie save(Movie newMovie);

}