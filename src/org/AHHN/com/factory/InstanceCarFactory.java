package org.AHHN.com.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by XJX on 2016/2/28.
 */
public class InstanceCarFactory {
	private Map<String, Car> cars = null;

	public InstanceCarFactory() {
		cars = new HashMap<>();
		cars.put("奔驰", new Car("奔驰", 600000.1));
		cars.put("宝马", new Car("宝马", 500000));
	}

	public Car getCar(String name) {
		return cars.get(name);
	}
}
