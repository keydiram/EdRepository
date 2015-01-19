package com.myorg.javacourse;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Stock {
	
	private String symbol;
	private float ask,bid;
	private Date date;
	
	

	public Stock(String symbol, float ask, float bid) {
		super();
		this.symbol = symbol;
		this.ask = ask;
		this.bid = bid;
		date=new Date();
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
	
	public String getHtmlDescription(){
		
		String result="<b>Stock symbol: </b>"+symbol+"<b> ask: </b>"+ask+"<b> bid: </b>"+bid+"<b> date: </b>"+this.getDate();
		return result;
	}

}
