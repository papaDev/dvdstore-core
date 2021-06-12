package com.mycompany.dvdstore.core;

import java.util.Scanner;

import com.mycompany.dvdstore.core.controlller.MovieController;
import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.repository.FileMovieRepository;
import com.mycompany.dvdstore.core.service.DefaultMovieService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MovieController movieController = new MovieController();
    	FileMovieRepository movieRepository = new FileMovieRepository();
    	DefaultMovieService movieService = new DefaultMovieService();
    	movieController.setMovieService(movieService);
    	movieService.setMovieRepository(movieRepository);
    	movieController.addUsingConsole();
    }
}
