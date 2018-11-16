package com.cg.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory=new ClassPathXmlApplicationContext("userdata.xml");
		User user=(User) factory.getBean("user");
		System.out.println("username:"+user.getUsername());
		System.out.println("password:"+user.getPassword());

	}

}
