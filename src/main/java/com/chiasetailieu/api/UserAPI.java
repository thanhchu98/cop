package com.chiasetailieu.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chiasetailieu.model.User;
import com.chiasetailieu.service.IUserService;
import com.chiasetailieu.utils.HttpUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class UserAPI
 */
@WebServlet(urlPatterns = "/api-admin-user")
public class UserAPI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	@Inject
	IUserService userService;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		User user =  HttpUtil.of(request.getReader()).toModel(User.class);
		user = userService.save(user);
		mapper.writeValue(response.getOutputStream(), user);
	}
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
	}

}
