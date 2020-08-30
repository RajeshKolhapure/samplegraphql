package com.sample.graphql.model;

/**
 * @author Rajesh Kolhapure
 * 
 */
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Actor {

	private String name;
	private String dob;
}
