package org.anhn.com.autowire;

/**
 * Created by XJX on 2016/2/26.
 */
public class Address {
	private String city;
	private String address;

	public Address() {
	}

	public Address(String city, String address) {
		this.city = city;
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address{" +
				"city='" + city + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
