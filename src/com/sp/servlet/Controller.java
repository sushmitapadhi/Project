package com.sp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sp.Project;
import com.sp.DAO.ProjectDAO;

/**
 * Servlet implementation class Connector
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doget(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String domain = request.getParameter("domain");
		
		Project p=new Project(id,title,description,domain);
		ProjectDAO pdao= new ProjectDAO();
		
		boolean b=pdao.insertProject(p);
		if( b=true);
		RequestDispatcher rd=request.getRequestDispatcher("successful.jsp");
		rd.forward(request, response);
		
		
	}

}
