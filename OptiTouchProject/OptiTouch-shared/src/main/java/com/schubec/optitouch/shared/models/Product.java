package com.schubec.optitouch.shared.models;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Product implements IsSerializable {
	private String id;
	private String test;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}


	
}
