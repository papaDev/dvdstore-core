package com.mycompany.dvdstore.core;

import java.util.Scanner;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.service.MovieService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println( "What is the title movie ?" );
        String title = sc.nextLine();
        System.out.println( "What is the type movie ?" );
        String genre = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        
        MovieService movieService = new MovieService();
        movieService.registerMovie(movie);
        
        sc.close();
    }
}
