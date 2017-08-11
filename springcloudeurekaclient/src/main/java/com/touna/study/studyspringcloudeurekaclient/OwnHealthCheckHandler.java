package com.touna.study.studyspringcloudeurekaclient;

import org.springframework.stereotype.Component;

import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.appinfo.InstanceInfo.InstanceStatus;
public class OwnHealthCheckHandler implements HealthCheckHandler {

	@Override
	public InstanceStatus getStatus(InstanceStatus arg0) {
		System.out.println("心跳监控");
		if(arg0 == InstanceStatus.UP){
			System.out.println("服务正常");
		}
		return arg0;
	}
	
}
