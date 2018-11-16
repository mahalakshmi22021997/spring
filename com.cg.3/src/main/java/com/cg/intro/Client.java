package com.cg.intro;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory=new ClassPathXmlApplicationContext("currencylist.xml");
		CurrencyList curr=(CurrencyList) factory.getBean("currencyList");
		List<String> currency=curr.getCurrList();
		System.out.println(currency);
		

	}

}
