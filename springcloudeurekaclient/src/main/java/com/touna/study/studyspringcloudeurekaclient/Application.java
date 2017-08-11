package com.touna.study.studyspringcloudeurekaclient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class Application {
	@Autowired
	private DiscoveryClient  discoveryClient;
	@RequestMapping("/")
	public String home(){
		List<ServiceInstance> serviceInstance = discoveryClient.getInstances("eureka-client");
		if(serviceInstance != null && serviceInstance.size() > 0){
			System.out.println(serviceInstance.get(0).getUri());
		}
		return "Hello world!";
	}
	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}

}
