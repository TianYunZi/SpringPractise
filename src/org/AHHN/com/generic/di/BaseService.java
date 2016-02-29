package org.AHHN.com.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by XJX on 2016/2/29.
 */
public class BaseService<T> {
	@Autowired
	protected BaseRepository<T> repository;

	public void add(){
		System.out.println("add...");
		System.out.println(repository);
	}
}
