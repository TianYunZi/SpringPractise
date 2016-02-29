package org.AHHN.com.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by XJX on 2016/2/28.
 */
public class StaticFactory {
	private static Map<String,Car> cars=new HashMap<>();

	static {
		cars.put("奥迪",new Car("奥迪",200000));
		cars.put("福特",new Car("福特",300000));
	}

	public static Car getCar(String name){
		return cars.get(name);
	}
}
