package com.mycompany.dvdstore.core.service;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.repository.MovieRepository;

public class MovieService {
	
	private MovieRepository movieRepository = new MovieRepository();
	
	public void registerMovie(Movie movie) {
		movieRepository.add(movie);
	}

}
