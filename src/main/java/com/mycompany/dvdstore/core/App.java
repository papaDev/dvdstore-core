package com.mycompany.dvdstore.core;

import java.util.Scanner;

import com.mycompany.dvdstore.core.controlller.MovieController;
import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.core.service.MovieService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MovieController movieController = new MovieController();
    	GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();
    	MovieService movieService = new MovieService();
    	movieController.setMovieService(movieService);
    	movieService.setMovieRepository(movieRepository);
    	movieController.addUsingConsole();
    }
}
