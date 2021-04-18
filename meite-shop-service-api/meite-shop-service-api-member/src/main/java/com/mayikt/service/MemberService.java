package com.mayikt.service;

import org.springframework.web.bind.annotation.GetMapping;

import com.mayikt.entity.AppEntity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "会员服务接口123")
public interface MemberService {
    @ApiOperation(value="会员调用微信服务接口")
	@GetMapping("/memberToWeixin")
	public AppEntity memberToWeixin();
	
}
