package com.mycompany.dvdstore.core.repository.memory;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.repository.MovieRepositoryInterface;

//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {
	
	public static long lastId=0L;
	
	private static List<Movie> movies = new ArrayList<>();
	
	public Movie add(Movie movie) {
		movie.setId(lastId++);
		movies.add(movie);
		System.out.println("The movie " + movie.getTitle() + " has been added.");
		return movie;
	}

	@Override
	public List<Movie> list() {
		return movies;
	}

    @Override
    public Movie getById(long id) {
        return movies.stream().
                filter(m -> m.getId()==id).
                findFirst().get();
    }
    
}
