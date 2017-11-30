package com.touna.study.studyspringcloudeurekaclient.test;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient("STUDY-EUREKA")
@RequestMapping("/server")
public interface ServerDemo {
	@RequestMapping("/say")
	public String server();
	@RequestMapping("/fallback")
	public String fallback();
}
