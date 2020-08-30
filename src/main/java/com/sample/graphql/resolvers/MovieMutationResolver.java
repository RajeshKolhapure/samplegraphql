package com.sample.graphql.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.sample.graphql.model.Actor;
import com.sample.graphql.model.Movie;
import com.sample.graphql.model.Song;
import com.sample.graphql.service.MovieService;
/**
 * @author Rajesh Kolhapure
 * 
 */
@Component
public class MovieMutationResolver implements GraphQLMutationResolver
{
    @Autowired
    private MovieService movieService;

    public Movie createMovie (Movie movie) {
        return movieService.createMovieRecord(movie);
    }
    
    public Song createSong (Song song) {
        return movieService.createSongRecord(song);
    }
    
    public Actor createActor (Actor actor) {
        return movieService.createActorRecord(actor);
    }
    
}
