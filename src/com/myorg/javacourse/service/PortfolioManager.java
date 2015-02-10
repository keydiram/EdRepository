package com.myorg.javacourse.service;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.myorg.javacourse.model.Portfolio;
import com.myorg.javacourse.model.Stock;

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
		Stock stock1=new Stock("PIH",13.1f,12.4f,cal);
		Stock stock2=new Stock("AAL",5.78f,5.5f,cal);
		Stock stock3=new Stock("CAAS",32.2f,31.5f,cal);
		// add 3 stocks
		portFolio.addStock(stock1);
		portFolio.addStock(stock2);
		portFolio.addStock(stock3);

		return portFolio;
	}
	
	public Portfolio getPortfolioCopy(Portfolio portfolioOther){
		Portfolio portFolio = new Portfolio(portfolioOther);
		return portFolio;
	}

}
