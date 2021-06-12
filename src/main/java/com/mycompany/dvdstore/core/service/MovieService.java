package com.mycompany.dvdstore.core.service;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.core.repository.MovieRepositoryInterface;

public class MovieService implements MovieServiceInterface {
	
	private MovieRepositoryInterface movieRepository;
	
	public MovieRepositoryInterface getMovieRepository() {
		return movieRepository;
	}

	public void setMovieRepository(MovieRepositoryInterface movieRepository) {
		this.movieRepository = movieRepository;
	}

	public void registerMovie(Movie movie) {
		movieRepository.add(movie);
	}

}
