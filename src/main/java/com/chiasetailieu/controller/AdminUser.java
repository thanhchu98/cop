package com.chiasetailieu.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chiasetailieu.model.User;
import com.chiasetailieu.service.IUserService;
import com.chiasetailieu.utils.FormUtil;

/**
 * Servlet implementation class AdminUser
 */
@WebServlet("/admin-user")
public class AdminUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Inject
	private IUserService userService;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User model = FormUtil.toModel(User.class, request);
		String url = "";
		if(model.getType()==null) {			
			url = "/view/admin-form/pages/tables/jquery-datatable.jsp";
			model.setListResult(userService.findAll());
		}
		else {
			url = "/view/admin-form/pages/forms/AddUser.jsp";
		}
		request.setAttribute("model", model);
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
