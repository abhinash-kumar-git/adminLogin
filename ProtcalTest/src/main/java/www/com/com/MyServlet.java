package www.com.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet implements Servlet{
	ServletConfig config;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.config=config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "this is abhinash kumar";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		this.config=config;
		System.out.println("Servlet create here...........");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("servlet method---------");
		arg1.setContentType("text/html");
		PrintWriter out=arg1.getWriter();
		out.println("<h1> this my servlet </h1>");
		out.println("<h1>todya is date and time" +new Date().toString()+"<h1>");
		
	}

}
