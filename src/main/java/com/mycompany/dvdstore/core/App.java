package com.mycompany.dvdstore.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.mycompany.dvdstore.core.controller.MovieController;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.mycompany.dvdstore.core.controller", "com.mycompany.dvdstore.core.service", "com.mycompany.dvdstore.core.repository.file"})
@PropertySource("classpath:application.properties")
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

    	MovieController movieController = context.getBean(MovieController.class);
    	
    	movieController.addUsingConsole();
    	
    }
}
