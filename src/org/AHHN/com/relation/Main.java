package org.AHHN.com.relation;

import org.anhn.com.autowire.Address;
import org.anhn.com.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by XJX on 2016/2/28.
 */
public class Main {
	public static void main(String[] args){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-relation.xml");

		Address address= (Address) ctx.getBean("address");
		System.out.println(address);

		Address address2=(Address)ctx.getBean("address2");
		System.out.println(address2);

		Person person=(Person)ctx.getBean("person");
		System.out.println(person);
	}
}
