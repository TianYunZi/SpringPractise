package org.AHHN.com.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by XJX on 2016/2/28.
 */
public class Main {
	public static void main(String[] args){
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans-cycle.xml");

		Car car=(Car)ctx.getBean("car");
		System.out.println(car);

		//关闭IOC容器
		ctx.close();
	}
}
