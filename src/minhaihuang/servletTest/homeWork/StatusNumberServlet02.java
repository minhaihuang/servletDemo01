package minhaihuang.servletTest.homeWork;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StatusNumberServlet02 extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer count=(Integer) getServletContext().getAttribute("count");
		
		if(count==null){
			count=0;
		}
		count++;
		
		//获取访问次数
		getServletContext().setAttribute("count", count);
		System.out.println("网站被访问的次数为"+count);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}

}
