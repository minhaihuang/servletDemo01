package minhaihuang.servletTest.test01;
/**
 * �������������
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
//		System.out.println(name);//����
		
		//��ʽһ����get��post��ʽ������
//		name = new String(name.getBytes("ISO-8859-1") , "utf-8");
//		System.out.println(name);
		
		//��ʽ��������post��˵��
//		request.setCharacterEncoding("utf-8");
//		String username = request.getParameter("username");
//		System.out.println(username);

//		//��ʽ������ʹ��reader����ʱ��
//		BufferedReader reader=new BufferedReader(request.getReader());
//		String line=reader.readLine();
//		System.out.println(line);//δ�����������������������
//		line=URLDecoder.decode(line,"utf-8");
//		System.out.println(line);//������������
		System.out.println("#######################");
		Object name=getServletContext().getAttribute("hhm");//�����hhm���������������������ģ������servletContext����������
		System.out.println(name);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}

}
