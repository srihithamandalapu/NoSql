package com.example.au.couchbasedemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.au.couchbasedemo.model.Movie;

import com.example.au.couchbasedemo.repository.MovieRepository;

@RestController
public class MovieController {
    
    @Autowired
    MovieRepository movieRepository;
    
	/*
	 * @RequestMapping("/") public String index() { return
	 * "Welcome to the CRUD application!!"; }
	 */
    
    @PostMapping("/Movie")
    public Movie addMovie(@RequestBody Movie newMovie) {
        return movieRepository.save(newMovie);
    }
    
    @GetMapping("/Movie/{id}")
    public Optional<Movie> getMovie(@PathVariable String id) {
        if (movieRepository.existsById(id)) {
            return movieRepository.findById(id);
        } else
            return Optional.empty();
    }
    
    @GetMapping("/Movie/MovieName/{movieName}")
    public Movie getMovieByMovieName(@PathVariable String movieName) {
        return movieRepository.findByMovieName(movieName);
    }
    
    
    
    @DeleteMapping("/Movie/{id}")
    public void deleteById(@PathVariable String id) {
        movieRepository.deleteById(id);
    }

    @GetMapping("/movie/city/{city}")
    public List<Movie> getMovieByCityName(@PathVariable String city) {
        List<Movie> moviesList=new ArrayList<>();
       movieRepository.findAll().forEach(Movie->{
           List<String> cityNames=Movie.getCityName();
             if(cityNames.contains(city))
               {
                   moviesList.add(Movie);
                   
               }
           
       });


            return moviesList;
    }

}