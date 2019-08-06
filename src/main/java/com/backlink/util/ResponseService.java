package com.backlink.util;

import org.springframework.stereotype.Service;

import com.backlink.define.AbstractMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service("responseService")
public class ResponseService implements AbstractMessage{
	
	private Response error = new Response(STATUS_ERROR, NOT_FOUND_API);
	
	public String createResponseString(String status, String message) {
		try {
			return new ObjectMapper().writeValueAsString(new Response(status, message));
		} catch (JsonProcessingException e) {
			return this.createResponseString(error);
		}
	}
	
	public String createResponseString(Response Response) {
		try {
			return new ObjectMapper().writeValueAsString(Response);
		} catch (JsonProcessingException e) {
			return null;
		}
	}
	
	public String createJSONString(Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			return this.createResponseString(error);
		}
	}	
	
	public Response createResponseObject(String status, String message) {
		return new Response(status,message);
	}
	
	public String notAuthentication() {
		return createResponseString(STATUS_ERROR, NOT_AUTHENTICATION);
	}
	
	public Response notAuthenticationResponse() {
		return new Response(STATUS_ERROR, NOT_AUTHENTICATION);
	}
}
