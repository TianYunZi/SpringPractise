package org.AHHN.com.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by XJX on 2016/2/28.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessorBeforeInitialization"+bean+", "+beanName);
		if("car".equals(beanName)){
			//...
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessorAfterInitialization"+bean+", "+beanName);
		Car car=new Car();
		car.setBrand("福特");
		return car;
	}
}
