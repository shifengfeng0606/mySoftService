package com.mayikt.service;

import org.springframework.web.bind.annotation.GetMapping;

import com.mayikt.entity.AppEntity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Api(tags = "微信服务接口")
public interface WeiXinService {
    
	@ApiOperation(value = "微信服务getAppInfo接口")
	@GetMapping("/getAppInfo")
	public AppEntity getAppInfo();
	
}
