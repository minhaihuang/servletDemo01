package minhaihuang.servletTest.homeWork;
/**
 * 要求：写一个Servlet , 打印出此Servlet每次被请求时客户端的ip
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetClientIPServlet extends HttpServlet {


	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String ip=request.getRemoteHost();//获取地址  0:0:0:0:0:0:0:1
			String ip2=request.getLocalAddr();//获取本机地址  0.0.0.0
			System.out.println(ip);
			System.out.println(ip2);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	
	}


}
