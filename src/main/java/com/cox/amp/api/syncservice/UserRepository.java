package com.cox.amp.api.syncservice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {

	/**
	 * Retrieve user list synchronously. Simulate the delay of a blocking call
	 * to a DB
	 */
	public Collection<User> getUsersSync(int responseDelay) {
		List<User> userList = Arrays.asList(new User[] { new User(1, "user1@example.com", "user1", "1230001"),
				new User(2, "user2@example.com", "user2", "1230002"),
				new User(3, "user3@example.com", "user3", "1230003") });
		try {
			Thread.sleep(responseDelay);
		} catch (InterruptedException e) {
		}
		return userList;
	}

}
