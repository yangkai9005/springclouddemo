package com.touna.study.studyspringcloudeurekaclient;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class Application {
	@Autowired
	private EurekaClient discoveryClient;
	@RequestMapping("/")
	public String home(){
		InstanceInfo  instance  = discoveryClient.getNextServerFromEureka("STUDY-EUREKA",false);
		StringBuilder sb = new StringBuilder();
		sb.append("getAppName:"+instance.getAppName());
		sb.append("getHealthCheckUrl:"+instance.getHealthCheckUrl());
		sb.append("getHostName:"+instance.getHostName());
		sb.append("getId:"+instance.getId());
		sb.append("getInstanceId:"+instance.getInstanceId());
		sb.append("getIPAddr:"+instance.getIPAddr());
		sb.append("getHomePageUrl:"+instance.getHomePageUrl());
		sb.append("getASGName:"+instance.getASGName());
		sb.append("getPort:"+instance.getPort());
		sb.append("getSecureHealthCheckUrl:"+instance.getSecureHealthCheckUrl());
		sb.append("getMetadata:"+new JSONObject(instance.getMetadata()).toString());
		return sb.toString();
	}
	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}

}
