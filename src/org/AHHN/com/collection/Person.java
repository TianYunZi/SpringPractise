package org.AHHN.com.collection;

import org.AHHN.com.Car;

import java.util.List;

/**
 * Created by XJX on 2016/2/25.
 */
public class Person {
	private String name;
	private int age;
	private List<Car> cars;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Person() {
	}

	public Person(String name, int age, List<Car> cars) {
		this.name = name;
		this.age = age;
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", cars=" + cars +
				'}';
	}
}
