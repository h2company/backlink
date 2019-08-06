package com.backlink.util;

import com.backlink.define.AbstractMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Response implements AbstractMessage{
	private String status;
	private String message;
	private boolean isSuccess;
	private Object data;

	public Response() {
		super();
	}

	public Response(String status, String message) {
		super();
		this.status = status;
		this.message = message;
		checking(status);
	}

	public Response(String status, String message, Object data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
		checking(status);
	}
	
	private void checking(String status) {
		if(STATUS_SECCESS.equals(status)) {
			this.setSuccess(true);
		}else {
			this.setSuccess(false);
		}
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
		checking(status);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String toJson() {
		try {
			return new ObjectMapper().writeValueAsString(this);
		} catch (JsonProcessingException e) {
			return null;
		}
	}
}
