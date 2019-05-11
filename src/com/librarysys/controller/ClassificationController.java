package com.librarysys.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.librarysys.model.Classification;
import com.librarysys.service.ClassificationService;
import com.librarysys.serviceimpl.ClassificationServiceImpl;

@WebServlet("/ClassificationController")
public class ClassificationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 public ClassificationController() {
//	        super();
	 }
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	 
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//			String classificationId = request.getParameter("classificationId");
			Integer classification_id= Integer.parseInt(request.getParameter("classification_id"));
			//int a = Integer.parseInt(classificationId);
			String classification_name = request.getParameter("classification_name");
	
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
	
			ClassificationService classificationService= context.getBean("classificationService",ClassificationServiceImpl.class);
	
			Classification classification = new Classification();
			classification.setClassificationId(classification_id);
			classification.setClassificationName(classification_name);
			
			classificationService.addClassification(classification);
			doGet(request,response);
//			response.getWriter().println("response");
		}

	}

