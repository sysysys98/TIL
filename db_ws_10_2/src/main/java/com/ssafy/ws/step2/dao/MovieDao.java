package com.ssafy.ws.step2.dao;

import java.util.List;

import com.ssafy.ws.step2.dto.Movie;

public interface MovieDao {
	public List<Movie> selectAllMovies();
	
	public boolean InsertMovie(Movie movie);
	
	public int movieCount();
}