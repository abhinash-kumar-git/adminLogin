package www.bold.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myservlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		System.out.println("this is get method");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>servlet here<h1>");
		out.println("long tempret ");
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		System.out.println("welcome here is print line number of squred ");
		res.setContentType("text/html");
		

}
}
