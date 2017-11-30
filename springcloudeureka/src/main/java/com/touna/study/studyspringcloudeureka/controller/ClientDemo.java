package com.touna.study.studyspringcloudeureka.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("EUREKA-CLIENT")
public interface ClientDemo {
	@RequestMapping("/port")
	public String port();
}
