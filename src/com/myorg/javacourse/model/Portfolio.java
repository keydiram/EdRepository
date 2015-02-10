package com.myorg.javacourse.model;


public class Portfolio {
	
	private String title;
	private final int MAX_PORTFOLIO_SIZE=5;
	Stock[] stocks;
	private int portfolioSize=0;
	
	public Portfolio(String title){
		this.stocks = new Stock[MAX_PORTFOLIO_SIZE];
		this.title=title;
	}
	
	public Portfolio(Portfolio portfolio){
		
		this.title=portfolio.getTitle();
		this.stocks = new Stock[MAX_PORTFOLIO_SIZE];
		this.portfolioSize=portfolio.getPorfolioSize();
		for(int i=0;i<portfolio.getPortfolioSize();i++){
			this.stocks[i]=new Stock(portfolio.getStock(i));
		}
	}
	
	public void addStock(Stock stock){
		stocks[portfolioSize]=stock;
		portfolioSize++;
	}
	
	public void removeStock(int place){
		if(place>stocks.length){
			System.out.println("the location you ask to delete doesn't exist in this portfoilo");
			return;
		}
		if(stocks[place]==null){
			System.out.println("the place you ask to delete is empty");
			return;
		}
		stocks[place]=null;
		for(int i=0;i<stocks.length-1;i++){
			stocks[i]=stocks[i+1];
		}
		portfolioSize--;
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
	
	public String getTitle(){
		return title;
	}
	
	public int getPortfolioSize(){
		return portfolioSize;
	}
	
	public Stock getStock(int i){
		return stocks[i];
	}
	
	public int getPorfolioSize(){
		return portfolioSize;
	}
	
	public void setTitle(String title){
		this.title=title;
	}

	
}
