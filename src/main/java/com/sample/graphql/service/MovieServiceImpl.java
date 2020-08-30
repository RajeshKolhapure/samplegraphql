package com.sample.graphql.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sample.graphql.model.Actor;
import com.sample.graphql.model.Movie;
import com.sample.graphql.model.Song;
/**
 * @author Rajesh Kolhapure
 * 
 */
@Service
public class MovieServiceImpl implements MovieService
{
    private Map<String, Movie> movieMap = new HashMap<String, Movie>();
    private Map<String, Song> songMap = new HashMap<String, Song>();
    private Map<String, Actor> actorMap = new HashMap<String, Actor>();

	@Override
	public Movie createMovieRecord(Movie movie) {
		System.out.println("movie="+movie);
		movieMap.put(movie.getName(), movie);
        return movie;
	}

	@Override
	public Song createSongRecord(Song song) {
		System.out.println("song="+song);
		songMap.put(song.getTitle(), song);
		return song;
	}
	
	@Override
	public Actor createActorRecord(Actor actor) {
		System.out.println("actor="+actor);
		actorMap.put(actor.getName(), actor);
		return actor;
	}

	@Override
	public List<Actor> getAllActors() {
		if (!actorMap.isEmpty()) {
			return new ArrayList<Actor>(actorMap.values());
		}
		return null;
	}

	@Override
	public List<Movie> getMoviesByActorName(String actorName) {
		List<Movie> movies = new ArrayList<Movie>();
		if (!movieMap.isEmpty()) {
			for (Object value : movieMap.values()) {
				Movie movie = (Movie) value;
				for (Actor actor : movie.getActors()) {
					if (actor.getName().equalsIgnoreCase(actorName)) {
						movies.add(movie);
					}
				}
			}
		}
		return movies;
	}

	@Override
	public List<Song> getAllSongs() {
		if (!songMap.isEmpty()) {
			return new ArrayList<Song>(songMap.values());
		}
		return null;
	}
}
