package com.steepsouth.groceries.servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;


/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public WelcomeServlet() {
        super();
        System.out.println("!!! WelcomeServlet constructor !!!");
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        System.out.println("!!! WelcomeServlet service() method  !!!");

	}
	
	public void init(){
        System.out.println("!!! WelcomeServlet no-arg init() method  !!!");

	}
	
	@Override
	public void destroy() {
        System.out.println("!!! WelcomeServlet destroy() method  !!!");
	}
	
	@Override
	public String getServletInfo() {
        System.out.println("!!! WelcomeServlet getServletInfo() method  !!!");

		return "WelcomeServlet";
	}


	
	public String getServletName() {
		// TODO Auto-generated method stub
        System.out.println("!!! WelcomeServlet getServletName() method  !!!");

		return "WelcomeServlet";
		
	}

	@Override
	public void init(ServletConfig servletConfig) throws ServletException {

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}
}
