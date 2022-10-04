package www.com.ds;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		out.print("<h1> this print here number<h1>");
		String name=req.getParameter("user_name");
		String email=req.getParameter("user_email");
		String pass=req.getParameter("user_password");
		String phone=req.getParameter("user_phone");
		String check=req.getParameter("condition");
		String slect=req.getParameter("username");
		String couser=req.getParameter("course");
		if(check!=null) {
			out.println("<h1> this my"+name);
			out.print(name+"  "+email+"    "+pass+"     "+phone+"     "+check+"     "+slect+"    "+couser);
			RequestDispatcher rd =req.getRequestDispatcher("success");
			rd.forward(req, res);
		}
		else {
			out.println("<h2> term and is not condition accept you<h2>");
			RequestDispatcher rd =req.getRequestDispatcher("index.jsp");
			rd.include(req, res);
		}
		
		
		
	}
	

}
