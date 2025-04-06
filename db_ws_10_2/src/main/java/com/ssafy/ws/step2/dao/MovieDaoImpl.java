package com.ssafy.ws.step2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.ws.step2.dto.Movie;
import com.ssafy.ws.step2.util.DBUtil;

public class MovieDaoImpl implements MovieDao {
	
	private static MovieDao dao = new MovieDaoImpl();
	
	private MovieDaoImpl () {}
	
	public static MovieDao getInstance() {
		return dao;
	}
	
	private  DBUtil util = DBUtil.getInstance();

	@Override
	public List<Movie> selectAllMovies() {
		List<Movie> list = new ArrayList<>();
		String sql = "SELECT * FROM movies";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = util.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Movie movie = new Movie();
				movie.setId(rs.getInt("id"));
				movie.setTitle(rs.getString("title"));
				movie.setDirector(rs.getString("director"));
				movie.setGenre(rs.getString("genre"));
				movie.setRunningtime(rs.getInt("runningtime"));
				
				list.add(movie);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			util.close(conn, stmt, rs);
		}		
		
		return list;
	}

	@Override
	public boolean InsertMovie(Movie movie) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO movies (id, title, director, genre, runningtime) VALUES(?, ?, ?, ?, ?)";
		
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  movie.getId());
			pstmt.setString(2,  movie.getTitle());
			pstmt.setString(3,  movie.getDirector());
			pstmt.setString(4,  movie.getGenre());
			pstmt.setInt(5,  movie.getRunningtime());
			
			int result = pstmt.executeUpdate(); //등록된 행값을 반환해줌
			System.out.println(result);
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			util.close(pstmt, conn);
		}		
		
		return false;
	}

	@Override
	public int movieCount() {
		return selectAllMovies().size();
	}
}
