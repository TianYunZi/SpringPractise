package org.AHHN.com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by XJX on 2016/2/25.
 */
public class Main {
	public static void main(String[] args){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");
		Person person3=(Person)ctx.getBean("person3");
		System.out.println(person3);

		Person2 newPerson=(Person2)ctx.getBean("newPerson");
		System.out.println(newPerson);

		DataSource dataSource=(DataSource)ctx.getBean("dataSource");
		System.out.println(dataSource);
		System.out.println(dataSource.getProperties());

		Person person4=(Person)ctx.getBean("person4");
		System.out.println(person4);

		Person person5=(Person)ctx.getBean("person5");
		System.out.print(person5+" +1");
	}
}
