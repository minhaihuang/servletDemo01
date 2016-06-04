package minhaihuang.servletTest.homeWork;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowPhotoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setHeader("Content-Type", "text/html;charset=utf-8");//设置编码格式
		PrintWriter writer=response.getWriter();//获取输出工具
		String pathString=getServletContext().getRealPath("/image/1.jpg");
		System.out.println(pathString);
		writer.write("<html>");
		writer.write("<head>");
		writer.write("</head>");
		writer.write("<body>");
		writer.write("<p>");
		writer.write("点击跳转到显示图片的servlet");
		writer.write("<a href='/servletDemo01/ShowPhotoMain' />点击显示小和尚");//WEB-INF是受保护的文件夹，浏览器无法直接进行访问
		writer.write("</p>");
		writer.write("</body>");
		writer.write("</html>");
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
