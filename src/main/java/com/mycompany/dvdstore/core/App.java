package com.mycompany.dvdstore.core;

import java.util.Scanner;

import com.mycompany.dvdstore.core.controlller.MovieController;
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
    	MovieController movieController = new MovieController();
    	movieController.addUsingConsole();
    }
}
