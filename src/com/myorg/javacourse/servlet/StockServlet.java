package com.myorg.javacourse.servlet;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.myorg.javacourse.model.Stock;

public class StockServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {


		GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
		cal.set(Calendar.MONTH, 10);
		cal.set(Calendar.DATE, 15);
		cal.set(Calendar.YEAR, 2014);



		Stock stock1=new Stock("PIH",13.1f,12.4f,cal);
		Stock stock2=new Stock("AAL",5.78f,5.5f,cal);
		Stock stock3=new Stock("CAAS",32.2f,31.5f,cal);




		resp.setContentType("text/html");
		resp.getWriter().println(stock1.getHtmlDescription()+"<br>"+stock2.getHtmlDescription()+"<br>"+stock3.getHtmlDescription());



	}
}
