package com.myorg.javacourse.service;

import java.util.Calendar;
import java.util.GregorianCalendar;
import com.myorg.javacourse.Stock;
import com.myorg.javacourse.model.Portfolio;

public class PortfolioManager {


	public PortfolioManager(){

	}


	public Portfolio getPortfolio(){

		Portfolio portFolio=new Portfolio("Ed's portfolio");
		//create 3 stocks
		GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
		cal.set(Calendar.MONTH, 10);
		cal.set(Calendar.DATE, 15);
		cal.set(Calendar.YEAR, 2014);
		Stock stock1=new Stock("PIH",13.1f,12.4f);
		Stock stock2=new Stock("AAL",5.78f,5.5f);
		Stock stock3=new Stock("CAAS",32.2f,31.5f);
		stock1.setDate(cal);
		stock2.setDate(cal);
		stock3.setDate(cal);
		// add 3 stocks
		portFolio.addStock(stock1);
		portFolio.addStock(stock2);
		portFolio.addStock(stock3);

		return portFolio;
	}

}
