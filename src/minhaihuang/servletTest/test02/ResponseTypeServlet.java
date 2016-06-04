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
			//直接输出到浏览器
			response.setHeader("Content-Type", "text/html;charset=utf-8");
			PrintWriter writer=response.getWriter();
			writer.write("<html>");
			writer.write("<head>");
			writer.write("</head>");
			writer.write("<body>");
			writer.write("<h1>");
			writer.write("哈哈哈");
			writer.write("<h1>");
			writer.write("</body");
			writer.write("</html>");
		}else if(code.equals("2")){
			//导航重定向，跳转到新的地址
			String newPath="http://www.baidu.com";
			response.sendRedirect(newPath);
		}else if(code.equals("3")){
			//方式把请求转发到另一个Servlet,让另一个Servlet去进一步处理请求并生成响应(path不带项目路径)
			request.getRequestDispatcher("/LifeTestServlet").forward(request,response);
		}
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	
	public void init() throws ServletException {
		
	}

}
