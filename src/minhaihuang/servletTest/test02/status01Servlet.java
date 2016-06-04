package minhaihuang.servletTest.test02;
/**
 * 统计某网站的访问次数
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class status01Servlet extends HttpServlet {


	public status01Servlet() {
		super();
	}


	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer count=(Integer) getServletContext().getAttribute("count");
		
		if(count==null){
			count=0;
		}
		count++;
		
		//设置回去
		getServletContext().setAttribute("count", count);
		System.out.println("该网站的访问次数为："+count);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}

	
	public void init() throws ServletException {
	
	}

}
