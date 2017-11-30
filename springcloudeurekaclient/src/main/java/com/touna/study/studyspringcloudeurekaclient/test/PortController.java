package com.touna.study.studyspringcloudeurekaclient.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortController {
	@Value("${server.port}")
	private String port;
	@RequestMapping("/port")
	public String port(){
		return port;
	}
}
