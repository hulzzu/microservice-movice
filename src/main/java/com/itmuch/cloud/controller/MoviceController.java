package com.itmuch.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.feign.UserFeignClient;


@RestController
@RequestMapping("/movice")
public class MoviceController {
	@Autowired
	private UserFeignClient userFeignClient;
	
	@GetMapping("/hello/{userName}")
	public String  getUserById(@PathVariable String  userName) {
		return userFeignClient.sayHello(userName);
	}
	
}
