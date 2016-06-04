package minhaihuang.servletTest.test02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseTypeServlet extends HttpServlet {

	
	public ResponseTypeServlet() {
		super();
	}

	
	public void destroy() {
		super.destroy();
		
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String code=request.getParameter("code");
		
		if(code.equals("1")){
			//ֱ������������
			response.setHeader("Content-Type", "text/html;charset=utf-8");
			PrintWriter writer=response.getWriter();
			writer.write("<html>");
			writer.write("<head>");
			writer.write("</head>");
			writer.write("<body>");
			writer.write("<h1>");
			writer.write("������");
			writer.write("<h1>");
			writer.write("</body");
			writer.write("</html>");
		}else if(code.equals("2")){
			//�����ض�����ת���µĵ�ַ
			String newPath="http://www.baidu.com";
			response.sendRedirect(newPath);
		}else if(code.equals("3")){
			//��ʽ������ת������һ��Servlet,����һ��Servletȥ��һ����������������Ӧ(path������Ŀ·��)
			request.getRequestDispatcher("/LifeTestServlet").forward(request,response);
		}
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	
	public void init() throws ServletException {
		
	}

}
