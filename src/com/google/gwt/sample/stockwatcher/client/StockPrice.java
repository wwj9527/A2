package com.google.gwt.sample.stockwatcher.client;
import java.io.Serializable;

public class StockPrice implements Serializable {

  private String symbol;
  private double pri;
  private double charge;
    private int pointer;
    private String yuan;
    private String name;



	public StockPrice() {
	}

	public StockPrice(String symbol, double pri, double charge) {
		this.symbol = symbol;
		this.pri = pri;
		this.charge = charge;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public double getPrice() {
		return this.pri;
	}

	public double getChange() {
		return this.charge;
	}

	public double getChangePercent() {
		return 100.0 * this.charge / this.pri;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setPrice(double pri) {
		this.pri = pri;
	}

	public void setChange(double charge) {
		this.charge = charge;
	}
}