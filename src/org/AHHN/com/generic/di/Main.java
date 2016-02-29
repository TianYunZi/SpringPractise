package org.AHHN.com.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by XJX on 2016/2/29.
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-generic-di.xml");

		UserService userService = (UserService) ctx.getBean("userService");
		userService.add();
		System.out.println(userService);
	}
}
