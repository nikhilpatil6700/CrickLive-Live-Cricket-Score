package com.cricket.apis.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.apis.enitities.Match;

import com.cricket.apis.service.CricketService;

	@RestController
	@RequestMapping("/cricket")
	@CrossOrigin("*")
	public class CricketController {

	    private CricketService cricketService;

	    public CricketController(CricketService cricketService) {
	        this.cricketService = cricketService;
	    }

	    // api for getting live matches

	    @GetMapping("/live")
	    public ResponseEntity<?> getLiveMatchScores() throws InterruptedException {
	        
	        return new ResponseEntity<>(cricketService.getLiveMatchScores(), HttpStatus.OK);
	    }
	    @GetMapping
	    public ResponseEntity<List<Match>> getAllMatches()
	    {
	    	return new ResponseEntity<>(cricketService.getAllMatches(),HttpStatus.OK);
	    }
	    
}

