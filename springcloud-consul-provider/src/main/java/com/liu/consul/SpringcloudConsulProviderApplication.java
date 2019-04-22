package com.liu.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient//consul服务发现
@SpringBootApplication
public class SpringcloudConsulProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConsulProviderApplication.class, args);
	}

}
