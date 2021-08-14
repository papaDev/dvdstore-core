package com.mycompany.dvdstore.core.repository;

import java.util.List;

import com.mycompany.dvdstore.core.entity.Movie;

public interface MovieRepositoryInterface {

	Movie add(Movie movie);
	
	List<Movie> list();
	
	Movie getById(long id);
	
}
