package com.ripples.rest.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ripples.rest.service.messages.GreetingMessage;
import com.ripples.rest.service.messages.Users;


@RestController
public class HelloWorldService {

	// hit this service from a browser using the url
	// http://localhost:8080/sayHello
	@RequestMapping("/sayHello")
	public String sayHello() {
		return "Say Hello";
	}

	// hit this service from a browser using the url
	// http://localhost:8080/sayHelloUser?name="shanmu"
	@RequestMapping("/sayHelloUser")
	public String sayHello(@RequestParam(value = "name", defaultValue = "Jackson") String nam) {
		return "Say Hello to " + nam;
	}

	@RequestMapping("/GreetingUser")
	public GreetingMessage greetingUser() {
		GreetingMessage msg = new GreetingMessage();
		msg.setGreeting("say Hello");
		msg.setName("Jackson");
		return msg;
	}

	//http://localhost:8080/GreetingUserName?msg=sayhello&name=Shanmu
	@RequestMapping("/GreetingUserName")
	public GreetingMessage greetingUser(@RequestParam(value="name",defaultValue="Jackson")String name, @RequestParam(value="msg",defaultValue="Hello") String message) {
		GreetingMessage msg = new GreetingMessage();
		msg.setGreeting(message);
		msg.setName(name);
		return msg;
	}
	
	//http://localhost:8080/GreetingUserName?msg=sayhello&name=Shanmu
	@RequestMapping("/GreetingVOUserName")
	public GreetingMessage greetingUser(GreetingMessage msg) {
		msg.setName(msg.getName().toUpperCase());
		msg.setGreeting(msg.getGreeting().toUpperCase());
		return msg;
	}
	
	@RequestMapping("/searchUsers")
	public List<Users> searchUsers(String searchString) {
		
		List<Users> l = new ArrayList<Users>();
		Users u1 = new Users();
		u1.setAge(21);
		u1.setName("Mahesh");
		Users u2 = new Users();
		u2.setAge(91);
		u2.setName("Mayandi");

		l.add(u1);
		l.add(u2);
		return l;
	}
	
	@RequestMapping("/searchUsersMap")
	public Map<String,Users> searchUsersMap(String searchString) {
		
		Map<String,Users> l = new HashMap<String,Users>();
		Users u1 = new Users();
		u1.setAge(21);
		u1.setName("Mahesh");
		Users u2 = new Users();
		u2.setAge(91);
		u2.setName("Mayandi");

		l.put(u1.getName(),u1);
		l.put(u2.getName(),u2);
		return l;
	}
}
