package com.ripples.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ripples.service.BankProcessor;
import com.ripples.spring.bean.UserBean;

/**
 * Servlet implementation class AddUser
 */
@WebServlet("/AddUser")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddUserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		ApplicationContext ac = (ApplicationContext) request.getSession().getServletContext()
				.getAttribute("springContext");
		UserBean bean = new UserBean();
		bean.setUserName(userName);
		bean.setPassword(password);
		BankProcessor b = (BankProcessor) ac.getBean("bankProcessor");
		System.out.println("Opening account for a user");
		b.addUSer(bean);
		response.getWriter().append("USer Added successfully");
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("LOADING SPRING BEANS");
		ApplicationContext ac = new ClassPathXmlApplicationContext("bank.xml");
		config.getServletContext().setAttribute("springContext", ac);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
