package com.mycompany.dvdstore.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mycompany.dvdstore.core.controller.MovieController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    	MovieController movieController = context.getBean(MovieController.class);
    	
    	movieController.addUsingConsole();
    	
    }
}
