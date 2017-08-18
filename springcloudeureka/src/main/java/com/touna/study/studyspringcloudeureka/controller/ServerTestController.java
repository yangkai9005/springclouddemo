package com.touna.study.studyspringcloudeureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/server")
public class ServerTestController {
	@RequestMapping("/say")
	@HystrixCommand(fallbackMethod="fallback")
	public String server(){
		int b = 2/0;
		return "eureka server";
	}
	public String fallback(){
		return "wrong fall back";
	}
}
