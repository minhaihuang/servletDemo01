package minhaihuang.servletTest.test02;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 测试乱码问题，以及乱码的解决方法
 * @author 黄帅哥
 *
 */
public class TestLuanMaServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//获取数据
		String username=req.getParameter("username");
        username = new String(username.getBytes("ISO-8859-1") , "utf-8");//解决乱码
		System.out.println(username);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}
}
