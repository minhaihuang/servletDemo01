package minhaihuang.servletTest.test01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextTestServlet extends HttpServlet {

	
	public ServletContextTestServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); 
		// Put your code here
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//ServletContext的获取方式
		ServletContext servletContext=getServletContext();
		
		//获得支持的servlet的最低的版本号
		int version=servletContext.getMinorVersion();
		System.out.println(version);
		
		String filePath="/aa/bb/c.txt";
		//辨别文件类型
		String type=servletContext.getMimeType(filePath);
		System.out.println(type);
		
		//获取web.xml中的指定的全局变量
		String v=servletContext.getInitParameter("version");
		System.out.println(v);
		
		//获取文件资源的路径，返回的是一个URL对象
		String path=servletContext.getResource("/test.html").toString();
		System.out.println(path);
		
		//servletContext.getRealPath(s);//获取资源文件的绝对路径
		String path1=servletContext.getRealPath("/test.html");
		System.out.println(path1);
		
		//设置全局属性，其他的servlet类也可以访问
		servletContext.setAttribute("hhm", "黄海敏");
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
