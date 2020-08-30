package com.sample.graphql.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Rajesh Kolhapure
 * 
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Movie {

	private String name;
	private int releaseYear;
	private int runningTime;
	private String genre;
	private List<Actor> actors;
	private List<Song> songs;
}
