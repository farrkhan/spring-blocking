package com.cox.amp.api.syncservice;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST service with methods to fetch users synchronously or asynchrounously
 * (reactive).
 */
@RestController
@RequestMapping("/user")
public class UserRestService {
	@Autowired
	UserRepository repository;

	@GetMapping("/sync")
	public Collection<User> syncList(@RequestParam(defaultValue = "500", value = "delay", required = false) int delay)
			throws InterruptedException {
		return repository.getUsersSync(delay);
	}


}
