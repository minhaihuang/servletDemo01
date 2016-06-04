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

		//ServletContext�Ļ�ȡ��ʽ
		ServletContext servletContext=getServletContext();
		
		//���֧�ֵ�servlet����͵İ汾��
		int version=servletContext.getMinorVersion();
		System.out.println(version);
		
		String filePath="/aa/bb/c.txt";
		//����ļ�����
		String type=servletContext.getMimeType(filePath);
		System.out.println(type);
		
		//��ȡweb.xml�е�ָ����ȫ�ֱ���
		String v=servletContext.getInitParameter("version");
		System.out.println(v);
		
		//��ȡ�ļ���Դ��·�������ص���һ��URL����
		String path=servletContext.getResource("/test.html").toString();
		System.out.println(path);
		
		//servletContext.getRealPath(s);//��ȡ��Դ�ļ��ľ���·��
		String path1=servletContext.getRealPath("/test.html");
		System.out.println(path1);
		
		//����ȫ�����ԣ�������servlet��Ҳ���Է���
		servletContext.setAttribute("hhm", "�ƺ���");
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
