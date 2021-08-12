package com.mycompany.dvdstore.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.service.MovieServiceInterface;

@Controller
public class HomeController {
	
	@Autowired
	private MovieServiceInterface movieService;
	
	public MovieServiceInterface getMovieService() {
		return movieService;
	}

	public void setMovieService(MovieServiceInterface movieService) {
		this.movieService = movieService;
	}

	@RequestMapping("/dvdstore-home.html")
	public @ModelAttribute("movies") List<Movie> displayHome() {
		return movieService.getLMovieList();
	}

}
