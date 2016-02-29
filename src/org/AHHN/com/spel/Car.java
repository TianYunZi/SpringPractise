package org.AHHN.com.spel;

/**
 * Created by XJX on 2016/2/28.
 */
public class Car {
	private String tyrePerimeter;
	private String brand;
	private double price;

	public Car() {
	}

	public Car(String tyrePerimeter, String brand, double price) {
		this.tyrePerimeter = tyrePerimeter;
		this.brand = brand;
		this.price = price;
	}

	public String getTyrePerimeter() {
		return tyrePerimeter;
	}

	public void setTyrePerimeter(String tyrePerimeter) {
		this.tyrePerimeter = tyrePerimeter;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car{" +
				"tyrePerimeter='" + tyrePerimeter + '\'' +
				", brand='" + brand + '\'' +
				", price=" + price +
				'}';
	}
}
