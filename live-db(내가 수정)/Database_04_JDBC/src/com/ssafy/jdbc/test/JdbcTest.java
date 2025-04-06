package com.ssafy.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.board.model.dto.Board;

public class JdbcTest {

	public JdbcTest() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패ㅠ");
//			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		JdbcTest db = new JdbcTest(); // 이제는 곤란해!
		
		
		for(Board board : db.selectAll()) {
			System.out.println(board);
		}

	}

	// 전체 게시글 조회
	private List<Board> selectAll() {
		List<Board> list = new ArrayList<>();
		///////////////////////////////////////////
		// DB 연결통로를 뚫겠다!
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssafy_board?serverTimezone=UTC",
					"ssafy", "ssafy");

			Statement stmt = conn.createStatement();
			
			String sql = "SELECT * FROM board"; //게시글 전체를 조회하는 SQL문
			
			ResultSet rs = stmt.executeQuery(sql);
			//데이터가 몇개 있는지 몰라!
			
			while(rs.next()) {
				Board board = new Board(); //바구니 세팅
				board.setId(rs.getInt("id"));
				board.setWriter(rs.getString("writer"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setViewCnt(rs.getInt("view_cnt"));
				board.setRegDate(rs.getString("reg_date"));
				
				list.add(board);
			}//내용채우기
			
			//list 에 모든 게시글이 들어있다.!
			
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

}
