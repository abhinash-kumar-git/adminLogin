package www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class s2
 */
@WebServlet("/s2")
public class s2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html;charaset=UTF-8");

		try (PrintWriter out = res.getWriter()) {
			out.print("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("</head>");

			out.println("<body>");

			String n = req.getParameter("n1");
			String nm = req.getParameter("n2");
			int n3 = Integer.parseInt(n);
			int n4 = Integer.parseInt(nm);
			int p = n3 + n4;
			int nm2 = (int) req.getAttribute("sum");
			out.println("<h1>this is file<h1>");
			out.println("<h2>hndnvkmsv.</h2>" + p);

			out.println("</body>");
			out.println("</html>");

		}

	}

	/*
	 * public s2() { super(); // TODO Auto-generated constructor stub }
	 * 
	 *//**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub
	 * response.getWriter().append("Served at: ").append(request.getContextPath());
	 * }
	 * 
	 *//**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
		 *      response)
		 *//*
			 * protected void doPost(HttpServletRequest request, HttpServletResponse
			 * response) throws ServletException, IOException { // TODO Auto-generated
			 * method stub doGet(request, response); }
			 */

}
