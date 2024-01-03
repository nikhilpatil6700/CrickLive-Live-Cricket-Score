package com.cricket.apis.service;
import java.util.List;
	

import com.cricket.apis.enitities.Match;


	public interface CricketService {

	    List<Match> getLiveMatchScores();
	   
	    List<Match> getAllMatches();
	    
	  
	    
	    
}


