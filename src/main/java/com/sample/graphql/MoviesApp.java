package com.sample.graphql;

/**
 * @author Rajesh Kolhapure
 * 
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesApp
{
    public static void main (String[] args)
    {
        SpringApplication app = new SpringApplication(MoviesApp.class);
        app.run(args);
    }
}
