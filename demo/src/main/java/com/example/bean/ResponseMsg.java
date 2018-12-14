package com.example.bean;

import lombok.Data;

@Data
public class ResponseMsg {
	private String message;
	
	public ResponseMsg(String msg){
		this.message=msg;
	}

}
