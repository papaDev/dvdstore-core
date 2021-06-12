package com.mycompany.dvdstore.core.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.service.MovieServiceInterface;

@Controller
public class MovieController {
	
	@Autowired
	private MovieServiceInterface movieService;
	
	public MovieServiceInterface getMovieService() {
		return movieService;
	}

	public void setMovieService(MovieServiceInterface movieService) {
		this.movieService = movieService;
	}

	public void addUsingConsole() {
		Scanner sc=new Scanner(System.in);
	    System.out.println( "What is the title movie ?" );
	    String title = sc.nextLine();
	    System.out.println( "What is the type movie ?" );
	    String genre = sc.nextLine();
	    Movie movie = new Movie();
	    movie.setTitle(title);
	    movie.setGenre(genre);
	    movieService.registerMovie(movie);
	    
	    sc.close();
	}
}
