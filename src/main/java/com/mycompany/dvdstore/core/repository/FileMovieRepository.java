package com.mycompany.dvdstore.core.repository;

import java.io.FileWriter;
import java.io.IOException;

import com.mycompany.dvdstore.core.entity.Movie;

public class FileMovieRepository implements MovieRepositoryInterface {
	
	public void add(Movie movie) {
	    FileWriter writer;
	    try{
	         writer=new FileWriter("C:\\temp\\movies.txt",true);
	         writer.write(movie.getTitle()+";"+movie.getGenre()+"\r\n");
	         writer.close();
	    }
	    catch (IOException e){
	         e.printStackTrace();
	    }
	    System.out.println("The movie "+ movie.getTitle() + " has been added.");
	}
	
}
