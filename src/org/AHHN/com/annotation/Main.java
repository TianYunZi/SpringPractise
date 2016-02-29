package org.AHHN.com.annotation;

import org.AHHN.com.annotation.controller.UserController;
import org.AHHN.com.annotation.repository.UserRepositoryImpl;
import org.AHHN.com.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by XJX on 2016/2/28.
 */
public class Main {
	public static void main(String[] args){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-annotation.xml");

//		TestObject testObject=(TestObject)ctx.getBean("testObject");
//		System.out.println(testObject);
//
		UserController userController=(UserController)ctx.getBean("userController");
		userController.execute();
		System.out.println(userController);
//
//		UserService userService=(UserService)ctx.getBean("userService");
//		System.out.println(userService);

//		UserRepositoryImpl userRepository=(UserRepositoryImpl)ctx.getBean("userRepository");
//		System.out.println(userRepository);
	}
}
