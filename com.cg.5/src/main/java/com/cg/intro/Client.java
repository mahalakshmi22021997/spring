package com.cg.intro;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory=new ClassPathXmlApplicationContext("client.xml");
		MessageSource source=(MessageSource) factory.getBean("messageSource");
		Locale locale=new Locale("en", "US");
		String msg=source.getMessage("welcome.message",null, locale);
		System.out.println(msg);

	}

}
