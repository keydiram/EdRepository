package com.myorg.javacourse.model;

import com.myorg.javacourse.Stock;

public class Portfolio {
	
	private String title;
	private final int MAX_PORTFOLIO_SIZE=5;
	Stock[] stocks;
	private int portfolioSize=0;
	
	public Portfolio(String title){
		stocks = new Stock[MAX_PORTFOLIO_SIZE];
		this.title=title;
	}
	
	public void addStock(Stock stock){
		stocks[portfolioSize]=stock;
		portfolioSize++;
	}
	
	public Stock[] getStocks(){
		return stocks;
	}
	
	public String getHtmlString(){
		String result="<h1>"+title+"</h1>";
		for(int i=0;i<portfolioSize;i++){
			result+=stocks[i].getHtmlDescription()+"<br>";
		}
		return result;
	}

	
}
