package minhaihuang.servletTest.test02;
/**
 * ͳ��ĳ��վ�ķ��ʴ���
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
		
		//���û�ȥ
		getServletContext().setAttribute("count", count);
		System.out.println("����վ�ķ��ʴ���Ϊ��"+count);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}

	
	public void init() throws ServletException {
	
	}

}
