package com.mycompany.dvdstore.core.controlller;

import java.util.Scanner;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.service.MovieServiceInterface;

public class MovieController {
	
	private MovieServiceInterface movieService;
	
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
