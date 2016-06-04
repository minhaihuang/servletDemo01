package minhaihuang.servletTest.test01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeTestServlet extends HttpServlet {

	public LifeTestServlet(){
		System.out.println("构造函数被调用了");
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet方法被调用了");
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}


	public void init() throws ServletException {
		System.out.println("init()方法被调用了");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("方法被调用了");
		super.init(config);
	}
	
	//不重写时会默认调用此方法
	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		System.out.println("service方法被调用了");
		super.service(req, res);//没有这一句，将不会调用doget方法
	}
}
