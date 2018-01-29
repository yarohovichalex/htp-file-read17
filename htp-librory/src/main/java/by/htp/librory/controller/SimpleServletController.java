package by.htp.librory.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.librory.action.BaseAction;
import by.htp.librory.action.util.ActionManager;

/**
 * Servlet implementation class SimpleServletController
 */
public class SimpleServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private BookDao dao = new SimpleBookDaoImpl(); // dao
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String userAction = request.getParameter("action");
		int value = Integer.parseInt(userAction);
		
		BaseAction action = ActionManager.defineAction(value);
		PrintWriter out = response.getWriter();
		action.doSmth(out);
	//	response.getWriter().append("Hello again!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doGet(request, response);
	}

}
