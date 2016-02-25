package org.AHHN.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by XJX on 2016/2/23.
 */
public class Main {
	public static void main(String[] args) {
//		HelloWorld helloWorld=new HelloWorld();
//		helloWorld.setName("冰雪世界");

		//1、创建spring的IOC容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		//2、从IOC容器中获取bean实例
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		Car car = (Car) ctx.getBean("car");
		Car car2 = (Car) ctx.getBean("car2");
		Person person = (Person) ctx.getBean("person");
		Person person2=(Person)ctx.getBean("person2");
		//3、调用hello()方法
		helloWorld.hello();
		System.out.println(car);
		System.out.println(car2);
		System.out.println(person);
		System.out.println(person2);
	}
}
