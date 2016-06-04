package minhaihuang.servletTest.homeWork;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 要求：写一个Servlet  , 使它能够接收请求路径为/aa/bb/cc请求 , 也 能接收所有后缀名为.do的请求
 * @author 黄帅哥
 *
 */
public class KindOfPathTestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setHeader("Content-Type", "text/plain;charset=utf-8");
		System.out.println("我被响应了");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}
}
