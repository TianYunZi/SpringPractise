package org.AHHN.com.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by XJX on 2016/2/28.
 */
public class Main {
	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-properties.xml");

		DataSource dataSource=(DataSource)ctx.getBean("dataSource");
		System.out.println(dataSource.getConnection());
	}
}
