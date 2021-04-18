package com.mayikt.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mayikt.entity.AppEntity;
import com.mayikt.feign.WeiXinFeignClient;
import com.mayikt.service.MemberService;

@RestController
public class MemberServiceImpl implements MemberService{
    
	@Autowired
	private WeiXinFeignClient weiXinFeignClient;
	
	
	@Override
	public AppEntity memberToWeixin() {
		return weiXinFeignClient.getAppInfo();
	}

}
