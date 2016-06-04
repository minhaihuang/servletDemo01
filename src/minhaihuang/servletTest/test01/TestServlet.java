package minhaihuang.servletTest.test01;
/**
 * 处理乱码的问题
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String name=request.getParameter("username");
//		System.out.println(name);//乱码
		
		//方式一，对get和post方式都适用
//		name = new String(name.getBytes("ISO-8859-1") , "utf-8");
//		System.out.println(name);
		
		//方式二，对于post来说的
//		request.setCharacterEncoding("utf-8");
//		String username = request.getParameter("username");
//		System.out.println(username);

//		//方式三，当使用reader方法时，
//		BufferedReader reader=new BufferedReader(request.getReader());
//		String line=reader.readLine();
//		System.out.println(line);//未经过处理的输出，会出现乱码
//		line=URLDecoder.decode(line,"utf-8");
//		System.out.println(line);//经过处理的输出
		System.out.println("#######################");
		Object name=getServletContext().getAttribute("hhm");//这里的hhm属性是在其他类中声明的，这就是servletContext的魅力所在
		System.out.println(name);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}

}
