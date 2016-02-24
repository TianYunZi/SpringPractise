package org.AHHN.com;

/**
 * Created by XJX on 2016/2/23.
 */
public class HelloWorld {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void hello() {
		System.out.println("Hello,World" + name);
	}
}
