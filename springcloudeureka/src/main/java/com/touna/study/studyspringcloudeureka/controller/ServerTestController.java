package com.touna.study.studyspringcloudeureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class ServerTestController {
	@RequestMapping("/say")
	public String server(){
		return "eureka server";
	}
}
