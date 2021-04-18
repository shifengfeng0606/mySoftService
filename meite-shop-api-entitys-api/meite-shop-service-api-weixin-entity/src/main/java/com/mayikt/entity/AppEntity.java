package com.mayikt.entity;

import lombok.Getter;
import lombok.Setter;


public class AppEntity {
	
	
	private String appId;
	
	
	private String appName;


	public String getAppId() {
		return appId;
	}


	public void setAppId(String appId) {
		this.appId = appId;
	}


	public String getAppName() {
		return appName;
	}


	public void setAppName(String appName) {
		this.appName = appName;
	}
	

	public AppEntity(String appId, String appName) {
		super();
		this.appId = appId;
		this.appName = appName;
	}

	
}


