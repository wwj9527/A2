package com.google.gwt.sample.stockwatcher.client;
import java.io.Serializable;

public class StockPrice implements Serializable {

  private String symbol;
  private double pri;
  private double change;


	public StockPrice() {
	}

	public StockPrice(String symbol, double pri, double change) {
		this.symbol = symbol;
		this.pri = pri;
		this.change = change;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public double getPrice() {
		return this.pri;
	}

	public double getChange() {
		return this.change;
	}

	public double getChangePercent() {
		return 100.0 * this.change / this.pri;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setPrice(double pri) {
		this.pri = pri;
	}

	public void setChange(double change) {
		this.change = change;
	}
}