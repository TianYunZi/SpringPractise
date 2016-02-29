package org.AHHN.com.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by XJX on 2016/2/28.
 */
public class CarFactoryBean implements FactoryBean<Car> {

	private String brand;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public Car getObject() throws Exception {
		return new Car(brand, 600000);
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
