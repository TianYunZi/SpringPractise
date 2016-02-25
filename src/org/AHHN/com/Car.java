package org.AHHN.com;

/**
 * Created by XJX on 2016/2/24.
 */
public class Car {
	private String brand;
	private String corp;
	private double price;
	private int maxSpeed;

	public Car(String brand, String corp, double price, int maxSpeed) {
		this.brand = brand;
		this.corp = corp;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}

	public Car(String brand, String corp, double price) {
		this.brand = brand;
		this.corp = corp;
		this.price = price;
	}

	public Car(String brand, String corp, int maxSpeed) {
		this.brand = brand;
		this.corp = corp;
		this.maxSpeed = maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car{" +
				"brand='" + brand + '\'' +
				", corp='" + corp + '\'' +
				", price=" + price +
				", maxSpeed=" + maxSpeed +
				'}';
	}
}
