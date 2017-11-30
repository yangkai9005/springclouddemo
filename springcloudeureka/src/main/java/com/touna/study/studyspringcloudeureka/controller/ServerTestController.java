package com.touna.study.studyspringcloudeureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/server")
public class ServerTestController {
	@Autowired
	private ClientDemo client;
	@RequestMapping("/port")
	public String server(){
		return client.port();
	}
}
