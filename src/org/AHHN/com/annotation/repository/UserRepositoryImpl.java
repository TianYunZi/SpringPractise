package org.AHHN.com.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by XJX on 2016/2/28.
 */
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
	@Override
	public void save() {
		System.out.println("UserRepository Save Method...");
	}
}
