package org.AHHN.com.collection;

import java.util.Properties;

/**
 * Created by XJX on 2016/2/26.
 */
public class DataSource {
	private Properties properties;

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Properties getProperties() {

		return properties;
	}

	public DataSource() {
	}

	public DataSource(Properties properties) {

		this.properties = properties;
	}

	@Override
	public String toString() {
		return "DataSource{" +
				"properties=" + properties +
				'}';
	}
}
