package com.cg.intro;

public class ExchangeServiceImpl implements ExchangeService {

	private double exchangeRate;
	
	public ExchangeServiceImpl(double exchangeRate) {
	System.out.println("ExchangeServiceImpl()");
		this.exchangeRate = exchangeRate;
	}

	public double getExchangeRate() {
		// TODO Auto-generated method stub
		System.out.println("getExchangeRate()");
		return exchangeRate;
	}

	
}
