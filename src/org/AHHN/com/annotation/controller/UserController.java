package org.AHHN.com.annotation.controller;

import org.AHHN.com.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by XJX on 2016/2/28.
 */
@Controller
public class UserController {

	@Autowired(required = false)
	private UserService userService;
	public void execute(){
		System.out.println("UserController execute");
		userService.add();
	}
}
