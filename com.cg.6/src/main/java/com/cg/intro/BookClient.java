package com.cg.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory=new AnnotationConfigApplicationContext(MyBookConfig.class);
		Book book=(Book) factory.getBean("book");
		System.out.println("hashcode:"+book.hashCode());
		System.out.println("book details: "+book);
	}

}
