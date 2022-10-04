package www.com.com.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException {
		System.out.println("seconds servlet ");
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		out.println("<h1> my seconds servlet here print</h1>");
		out.println("<h2> comapnay here is not availabe<h2>");
		
	}

}
