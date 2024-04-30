package com.org.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.org.dao.UserDao;

@WebServlet("/delete")

public class Delete extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String userId = req.getParameter("userId");
        
        if (userId != null) {
           
                int id = Integer.parseInt(userId);
                
                UserDao dao = new UserDao();
                dao.deleteUser(id);
                resp.sendRedirect("home.jsp"); 
           
                
            
        } 
		
	}

}
