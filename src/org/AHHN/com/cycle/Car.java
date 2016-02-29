package org.AHHN.com.cycle;

/**
 * Created by XJX on 2016/2/28.
 */
public class Car {
	public Car(){
		System.out.println("Car's Constructor...");
	}

	private String brand;

	public void setBrand(String brand) {
		System.out.println("Set brand...");
		this.brand = brand;
	}

	public void init(){
		System.out.println("init...");
	}

	@Override
	public String toString() {
		return "Car{" +
				"brand='" + brand + '\'' +
				'}';
	}

	public void destroy(){
		System.out.println("destroy...");
	}
}
