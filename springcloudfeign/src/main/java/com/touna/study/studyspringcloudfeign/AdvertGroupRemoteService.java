package com.touna.study.studyspringcloudfeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "test")
public interface AdvertGroupRemoteService {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	String test();
}
