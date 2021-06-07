package com.mycompany.dvdstore.core.service;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.repository.GoLiveMovieRepository;

public class MovieService {
	
	private GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();
	
	public void registerMovie(Movie movie) {
		movieRepository.add(movie);
	}

}
