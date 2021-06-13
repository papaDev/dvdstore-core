package com.mycompany.dvdstore.core.repository.memory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.repository.MovieRepositoryInterface;

//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {
	
	private static List<Movie> movies = new ArrayList<>();
	
	public void add(Movie movie) {
		movies.add(movie);
		System.out.println("The movie " + movie.getTitle() + " has been added.");
	}

}
