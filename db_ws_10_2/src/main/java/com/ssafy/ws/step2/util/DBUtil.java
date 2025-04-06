package com.ssafy.ws.step2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Mysql DB 연결 객체를 제공하주고, 사용했던 자원을 해제하는 기능을 제공하는 클래스입니다.
 */
public class DBUtil {
	private final String url = "jdbc:mysql://localhost:3306/ssafy?serverTimezone=UTC";
	// DB의 USER 이름
	private final String username = "ssafy";
	// 위 USER의 PASSWORD
	private final String password = "ssafy1234";
	// Mysql 드라이버 클래스 이름
	private final String driverName = "com.mysql.cj.jdbc.Driver";
	
	private static DBUtil instance = new DBUtil();

    private DBUtil() {
        // JDBC 드라이버를 로딩한다. 드라이버 로딩은 객체 생성 시 한번만 진행하도록 하자.
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static DBUtil getInstance() {
        return instance;
    }
    
    public Connection getConnection() throws SQLException{
    	return DriverManager.getConnection(url, username, password);
    }
    
    public void close(AutoCloseable... closeables) {
        for (AutoCloseable c : closeables) {
            if (c != null) {
                try {
                    c.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

