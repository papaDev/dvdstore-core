package com.mycompany.dvdstore.core.service;

import java.util.List;

import com.mycompany.dvdstore.core.entity.Movie;

public interface MovieServiceInterface {

	Movie registerMovie(Movie movie);
	
	List<Movie> getLMovieList();
	
	Movie getMovieById(long id);
	
}
