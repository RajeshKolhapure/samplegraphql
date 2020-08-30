package com.sample.graphql.resolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sample.graphql.model.Actor;
import com.sample.graphql.model.Movie;
import com.sample.graphql.model.Song;
import com.sample.graphql.service.MovieService;
/**
 * @author Rajesh Kolhapure
 * 
 */
@Component
public class MovieQueryResolver implements GraphQLQueryResolver
{
    @Autowired
    private MovieService movieService;

    public List<Actor> actors ()
    {
        return movieService.getAllActors();
    }
    
    public List<Movie> moviesByActorName (String actorName)
    {
        return movieService.getMoviesByActorName(actorName);
    }
    
    public List<Song> songs ()
    {
        return movieService.getAllSongs();
    }
}
