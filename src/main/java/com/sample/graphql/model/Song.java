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
public class Song {

	private String title;
	private String genre;
	private List<Actor> actors;
}
