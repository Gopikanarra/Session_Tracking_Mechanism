package com.HttpSessionTracking;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String name=request.getParameter("name");
	String age=request.getParameter("age");
	
	//lets create a session object and store these 
	
	HttpSession session=request.getSession();
	session.setAttribute("name",name);
	session.setAttribute("age",age);
	
	
	//forward the response to form2.html
	
	request.getRequestDispatcher("/form2.html").forward(request,response);
	
	
	
	
	
	
	
	}

}
