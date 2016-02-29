package org.AHHN.com.annotation.service;

import org.AHHN.com.annotation.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by XJX on 2016/2/28.
 */
@Service
public class UserService {

	@Autowired
	private UserRepositoryImpl userRepository;
	public void add(){
		System.out.println("UserService add method...");
		userRepository.save();
	}
}
