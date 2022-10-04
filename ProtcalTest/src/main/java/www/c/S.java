package www.c;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S
 */
@WebServlet("/S1")
public class S extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 * 
	 */
	protected void processRequest(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html;charaset=UTF-8");

		try (PrintWriter out = res.getWriter()) {
			out.print("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			out.println("</html>");
			out.println("<body>");

			String n1 = req.getParameter("n1");
			String n2 = req.getParameter("n2");
			int n3 = Integer.parseInt(n1);
			int n4 = Integer.parseInt(n2);
			int s = n3 + n4;
			req.setAttribute("sum", s);
			RequestDispatcher rd = req.getRequestDispatcher("s2");
			rd.forward(req, res);

			out.println("</body>");

		}

	}

	/*
	 * public S() { super(); 
	 * // TODO Auto-generated constructor stub }
	 * 
	 */
	/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub
	 * response.getWriter().append("Served at: ").append(request.getContextPath());
	 * 
	 * }
	 * 
	 */
	/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
	/*
			 * protected void doPost(HttpServletRequest request, HttpServletResponse
			 * response) throws ServletException, IOException { // TODO Auto-generated
			 * method stub doGet(request, response); }
			 */

}
