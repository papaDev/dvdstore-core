package com.mycompany.dvdstore.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.repository.MovieRepositoryInterface;

@Service
public class DefaultMovieService implements MovieServiceInterface {
	
	@Autowired
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

	@Override
	public List<Movie> getLMovieList() {
		return movieRepository.list();
	}

}
