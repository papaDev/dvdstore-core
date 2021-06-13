package com.mycompany.dvdstore.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.mycompany.dvdstore.core.controller", "com.mycompany.dvdstore.core.service", "com.mycompany.dvdstore.core.repository.file"})
@PropertySource("classpath:application.properties")
public class AppConfig {

}
