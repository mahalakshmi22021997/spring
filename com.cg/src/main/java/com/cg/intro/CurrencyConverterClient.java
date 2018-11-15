package com.cg.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CurrencyConverterClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext(
				"currencyconverter.xml");
		CurrencyConverter curr = (CurrencyConverter) factory
				.getBean("currencyConverter");
		double rupees = curr.dollarsToRupees(100.0);
		System.out.println("100.0 $ is" + rupees + "Rs.");

	}

}
