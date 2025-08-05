package com.yal.store.Exercises.NotificationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
	Small exercise for understanding Spring's IoC
*/


@SpringBootApplication
public class NotificationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(NotificationApplication.class, args);
		var manager = context.getBean(NotificationManager.class);
		manager.sendNotification("Hello World");
	}

}
