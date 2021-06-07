package com.mycompany.dvdstore.core.repository;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.dvdstore.core.entity.Movie;

public class MovieRepository implements MovieRepositoryInterface {
	
	private static List<Movie> movies = new ArrayList<>();
	
	public void add(Movie movie) {
		movies.add(movie);
		System.out.println("The movie " + movie.getTitle() + " has been added.");
	}

}
