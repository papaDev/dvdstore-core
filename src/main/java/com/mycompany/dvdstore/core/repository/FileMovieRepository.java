package com.mycompany.dvdstore.core.repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;

import com.mycompany.dvdstore.core.entity.Movie;

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
	
}
