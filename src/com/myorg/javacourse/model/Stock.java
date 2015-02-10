package com.myorg.javacourse.model;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Stock {
	
	private String symbol;
	private float ask,bid;
	private Date date;
	public static final int BUY=0;
	public static final int SELL=1;
	public static final int REMOVE=2;
	public static final int HOLD=3;
	

	public Stock(String symbol, float ask, float bid,GregorianCalendar cal) {
		super();
		this.symbol = symbol;
		this.ask = ask;
		this.bid = bid;
		date=new Date();
		date.setTime(cal.getTimeInMillis());
    }
	
	public Stock(Stock stock){
		
		this.symbol=stock.getSymbol();
		this.ask=stock.getAsk();
		this.bid=stock.getBid();
		this.date=new Date();
		this.date.setTime(stock.getTimeMil());
	}
	
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public float getAsk() {
		return ask;
	}
	public void setAsk(float ask) {
		this.ask = ask;
	}
	public float getBid() {
		return bid;
	}
	public void setBid(float bid) {
		this.bid = bid;
	}
	public String getDate() {
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		String DateToStr = format.format(date);
		return DateToStr;
	}
	public void setDate(GregorianCalendar cal) {
		date.setTime(cal.getTimeInMillis());
	}
	
	public long getTimeMil(){
		return date.getTime();
	}
	
	public String getHtmlDescription(){
		
		String result="<b>Stock symbol: </b>"+symbol+"<b> ask: </b>"+ask+"<b> bid: </b>"+bid+"<b> date: </b>"+this.getDate();
		return result;
	}
	
	public String toString(){
	
		String result="Stock symbol: "+symbol+" ask: "+ask+" bid: "+bid+" date: "+this.getDate();
		return result;
	}

}
