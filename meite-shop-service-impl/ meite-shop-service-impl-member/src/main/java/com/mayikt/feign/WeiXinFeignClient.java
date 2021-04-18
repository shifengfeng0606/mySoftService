package com.mayikt.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.mayikt.service.WeiXinService;

@FeignClient("app-mayikt-weixin")
public interface WeiXinFeignClient extends WeiXinService{

}
