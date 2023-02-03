package com.ifmi.beans;

public class GetStockPriceController {
	private StockTradeManager stockTradeManager;

	public double findStockPrice(String stockName) {
		double price = 0;
		price = stockTradeManager.getStockPrice(stockName);
		return price;
	}

	public void setStockTradeManager(StockTradeManager stockTradeManager) {
		this.stockTradeManager = stockTradeManager;
	}

}
