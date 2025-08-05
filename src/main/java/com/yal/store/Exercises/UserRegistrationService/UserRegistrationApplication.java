package com.yal.store.Exercises.UserRegistrationService;

import com.yal.store.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UserRegistrationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(UserRegistrationApplication.class, args);
		var userService = context.getBean(UserService.class);
		userService.registerUser(new User(1, "foo@gmail.com", "1234", "foo"));
		userService.registerUser(new User(2, "bar@gmail.com", "5678", "bar"));
		userService.registerUser(new User(1, "foo@gmail.com", "1234", "foo"));
	}

}
