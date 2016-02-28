package org.AHHN.com.scope;

import org.anhn.com.autowire.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by XJX on 2016/2/28.
 */
public class Main {
	public static void main(String[] args){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-scope.xml");

		Car car=(Car)ctx.getBean("car");
		System.out.println(car);

		Car car2=(Car)ctx.getBean("car");
		System.out.println(car2);
	}
}
