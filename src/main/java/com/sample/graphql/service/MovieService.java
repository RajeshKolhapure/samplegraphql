package com.sample.graphql.service;

import java.util.List;

import com.sample.graphql.model.Actor;
import com.sample.graphql.model.Movie;
import com.sample.graphql.model.Song;
/**
 * @author Rajesh Kolhapure
 * 
 */
public interface MovieService {

    public Movie createMovieRecord(Movie movie);
    
    public Song createSongRecord(Song song);
    
    public Actor createActorRecord(Actor actor);

	public List<Actor> getAllActors();

	public List<Movie> getMoviesByActorName(String actorName);

	public List<Song> getAllSongs();
    
}
