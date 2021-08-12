package com.mycompany.dvdstore.core.repository.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.repository.MovieRepositoryInterface;

@Repository
public class FileMovieRepository implements MovieRepositoryInterface {
	
	@Value("${movies.file.location}")
	private File file;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public void add(Movie movie) {
	    FileWriter writer;
	    try{
	         writer=new FileWriter(file,true);
	         writer.write(movie.getTitle()+";"+movie.getGenre()+"\r\n");
	         writer.close();
	    }
	    catch (IOException e){
	         e.printStackTrace();
	    }
	    System.out.println("The movie "+ movie.getTitle() + " has been added.");
	}

	@Override
	public List<Movie> list() {
		
	    List<Movie> movies=new ArrayList<>();
	    
	    try(BufferedReader br = new BufferedReader(new FileReader(file))) {
	        for(String line; (line = br.readLine()) != null; ) {
	            final Movie movie=new Movie();
	            final String[] titreEtGenre = line.split("\\;");
	            movie.setTitle(titreEtGenre[0]);
	            movie.setGenre(titreEtGenre[1]);
	            movies.add(movie);
	        }
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return movies;
	    
	}
	
}
