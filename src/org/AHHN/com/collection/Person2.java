package org.AHHN.com.collection;

import org.AHHN.com.Car;

import java.util.Map;

/**
 * Created by XJX on 2016/2/25.
 */
public class Person2 {
	private String name;
	private int age;
	private Map<String,Car> cars;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Map<String, Car> getCars() {
		return cars;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}

	public Person2() {
	}

	public Person2(String name, int age, Map<String, Car> cars) {
		this.name = name;
		this.age = age;
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Person2{" +
				"name='" + name + '\'' +
				", age=" + age +
				", cars=" + cars +
				'}';
	}
}
