package com.HttpSessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/SecondSevlet")
public class SecondSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		
		//lets create a session objet and store these 
		 HttpSession session=request.getSession();
		 
		 //retreive the session object
		 Object name=session.getAttribute("name");
		 Object age=session.getAttribute("age");
		 
		 //create a html page to take from session object and send the response
		 
		 response.setContentType("text/html");
		 
		 PrintWriter pw=response.getWriter();
		 pw.print("<center>");
		 pw.print("<table border='1' bgcolor:'lightyellow'>");
		 pw.print("<tr><td>name:</td><td>"+name+"</td></tr>");
		 pw.print("<tr><td>age:</td><td>"+age+"</td></tr>");
		 pw.print("<tr><td>email:</td><td>"+email+"</td></tr>");
		 pw.print("<tr><td>mobile:</td><td>"+mobile+"</td></tr>");
		pw.print("</table>");
		pw.print("</center>");
		pw.close();
		
		}
		
}
