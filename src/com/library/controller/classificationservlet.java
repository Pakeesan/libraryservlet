package com.library.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.model.Classification;
import com.library.service.ClassificationService;
import com.library.service.impl.ClassificationServiceImpl;

/**
 * Servlet implementation class classificationservlet
 */
@WebServlet("/classificationservlet")
public class classificationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public classificationservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		
		String mainclassid=request.getParameter("cid");
		int a=Integer.parseInt(mainclassid);
		String mainclassname =request.getParameter("cname");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Classificationconfig.xml");
		
		ClassificationService classificationService=context.getBean("classificationService",ClassificationServiceImpl.class);
		
		Classification classification=new Classification();
		
		classification.setClassificationId(a);
		classification.setClassificationName(mainclassname);
		
 		classificationService.addclassification(classification);
		doGet(request, response);
	}

}
