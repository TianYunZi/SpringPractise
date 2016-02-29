package org.AHHN.com.spel;

/**
 * Created by XJX on 2016/2/28.
 */
public class Person {
	private String name;
	private Car car;

	//根据Address的city属性确定city
	private String city;

	//根据Car的price属性确定info，如果price>=300000为金领，否则为白领
	private String info;

	public Person() {
	}

	public Person(String name, Car car, String city, String info) {
		this.name = name;
		this.car = car;
		this.city = city;
		this.info = info;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", car=" + car +
				", city='" + city + '\'' +
				", info='" + info + '\'' +
				'}';
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
