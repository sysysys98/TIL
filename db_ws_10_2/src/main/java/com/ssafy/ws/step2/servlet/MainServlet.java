package com.ssafy.ws.step2.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.ws.step2.dao.MovieDao;
import com.ssafy.ws.step2.dao.MovieDaoImpl;
import com.ssafy.ws.step2.dto.Movie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//이 서블릿이 호출되기 위해서는 url 상에 http://server_ip:port/context_name/main 이 필요하다.

@WebServlet("/main")
public class MainServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;	
	private static MovieDao dao = MovieDaoImpl.getInstance();
	private static List<Movie> movieList = dao.selectAllMovies();
	private static int mCnt = dao.movieCount();

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String method = req.getMethod();
		
		String action = req.getParameter("action");
		
		if (action == null) {
			action = "home";
		}
		
		switch (action) {
		case "registForm": {
			doRegistForm(req,res);			
			break;
			}
		case "regist": {
			doRegist(req,res);			
			break;
			}
		case "list":{
			doList(req,res);
			break;
			}		
		case "home":{
			req.getRequestDispatcher("/index.jsp").forward(req, res);
			break;
			}
		}
	}
	
	private void doRegistForm(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/regist.jsp").forward(req, res);
	}

	private void doRegist(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {	
		int mId = mCnt+1;
		String title = req.getParameter("title");
		String director = req.getParameter("director");
		String genre = req.getParameter("genre");
		int runningtime = Integer.parseInt(req.getParameter("runningtime"));

		Movie m = new Movie(mId, title, director, genre, runningtime);
		dao.InsertMovie(m);
		
		movieList = dao.selectAllMovies(); // 최신 목록으로 갱신
	    mCnt = movieList.size(); // 영화 개수 갱신
		
		req.getSession().setAttribute("regiMovie", m);
		req.getSession().setAttribute("mCnt",movieList.size());
		
		req.getRequestDispatcher("/WEB-INF/regist_result.jsp").forward(req, res);
	}
	
	private void doList(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		movieList = dao.selectAllMovies(); // 최신 목록으로 갱신
	    mCnt = movieList.size(); // 영화 개수 갱신
		
		req.getSession().setAttribute("movieList", movieList);
		req.getSession().setAttribute("mCnt",mCnt);
		
		req.getRequestDispatcher("/WEB-INF/list.jsp").forward(req, res);
	}
	
}