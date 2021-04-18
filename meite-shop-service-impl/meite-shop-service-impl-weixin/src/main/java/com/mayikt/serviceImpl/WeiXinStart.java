package com.mayikt.serviceImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.spring4all.swagger.EnableSwagger2Doc;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2Doc
public class WeiXinStart {
  
	public static void main(String[] args) {
		SpringApplication.run(WeiXinStart.class, args);
	}
	
}
