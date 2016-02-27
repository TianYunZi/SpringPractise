package org.anhn.com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by XJX on 2016/2/26.
 */
public class Main {
	public static void main(String[] args){
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans-autowire.xml");
		Person person=(Person)ctx.getBean("person");
		System.out.println(person);
	}
}
