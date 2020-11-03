package com.hazelcast.controller;

import com.hazelcast.model.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(path = "users")
public class UserController {

	@Autowired
	private Map<String, UserAccount> accountMap;

	@GetMapping(path = { "/get/{accountNumber}" })
	public UserAccount getUser(@PathVariable("accountNumber") String accountNumber) {
		return  (accountMap.get(accountNumber) != null) ? accountMap.get(accountNumber)
				: new UserAccount();
	}

	@PostMapping("/add")
	public void createUser(@RequestBody UserAccount user) {
		accountMap.put(user.getAccountNumber(), user);
	}

	@DeleteMapping(path = { "/delete/{accountNumber}" })
	public UserAccount deleteUser(@PathVariable("accountNumber") String accountNumber) {
				return accountMap.remove(accountNumber);
	}

}