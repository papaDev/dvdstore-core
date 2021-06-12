package com.mycompany.dvdstore.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.dvdstore.core.controller.MovieController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	MovieController movieController = context.getBean(MovieController.class);
    	
    	movieController.addUsingConsole();
    	
    }
}
