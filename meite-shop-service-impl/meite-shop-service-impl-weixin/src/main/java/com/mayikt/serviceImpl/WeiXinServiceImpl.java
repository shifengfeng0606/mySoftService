package com.mayikt.serviceImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import com.mayikt.entity.AppEntity;
import com.mayikt.service.WeiXinService;

@RestController
public class WeiXinServiceImpl implements WeiXinService {
	@Value("${server.port}")
	private String port;
	@Override
	public AppEntity getAppInfo() {
	    System.out.println("server port:"+port);
		return new AppEntity("sffId", "sffApp");
	}

}
