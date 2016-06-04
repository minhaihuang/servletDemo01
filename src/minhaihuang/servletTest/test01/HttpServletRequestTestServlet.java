package minhaihuang.servletTest.test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServletRequestTestServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		//System.out.println(request.getRemoteAddr()+"--"+request.getRemoteHost()+"--"+request.getRemotePort());
//		String s1=request.getScheme();
//		String s2=request.getServerName();
//		int s3=request.getServerPort();
//		String s4=request.getContextPath();
//		String s5=request.getServletPath();
//		StringBuffer s6=request.getRequestURL();
//		System.out.println(s1+"--"+s2+"--"+s3+"--"+s4+"--"+s5+"--"+s6);
		//获取请求行的相关信息
//		System.out.println(request.getMethod());//GET
//		System.out.println(request.getRequestURI());//servletDemo01/HttpServletRequestTestServlet
//		System.out.println(request.getProtocol());//HTTP/1.1
//		System.out.println(request.getQueryString());//username=hhm&password=123request.getMethod()
		
		BufferedReader reader=new BufferedReader(request.getReader());
		String line=null;
		while((line=reader.readLine())!=null){
			System.out.println(line);
		}
		
		System.out.println(123);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}


}
