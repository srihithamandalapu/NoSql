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

import com.example.au.couchbasedemo.model.FootBall;
import com.example.au.couchbasedemo.model.Movie;
import com.example.au.couchbasedemo.repository.FootBallRepository;




@RestController
public class FootBallController {
    
    @Autowired
    FootBallRepository footBallRepository;
    
	/*
	 * @RequestMapping("/") public String index() { return
	 * "Welcome to the CRUD application!!"; }
	 */
    
    @PostMapping("/FootBall")
    public FootBall addCountry(@RequestBody FootBall newCountry) {
        return footBallRepository.save(newCountry);
    }
    
    @GetMapping("/FootBall/{id}")
    public Optional<FootBall> getFootBall(@PathVariable String id) {
        if (footBallRepository.existsById(id)) {
            return footBallRepository.findById(id);
        } else
            return Optional.empty();
    }
    
    
    
    
    @DeleteMapping("/Movie/{id}")
    public void deleteById(@PathVariable String id) {
        footBallRepository.deleteById(id);
    }
    @GetMapping("/Country/CountryName/{countryName}")
    public Movie getMovieByMovieName(@PathVariable String countryName) {
        return footBallRepository.findByCountryName(countryName);
    }
    
    
    
    
    


           

}