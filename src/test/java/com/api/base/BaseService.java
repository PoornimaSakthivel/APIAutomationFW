package com.api.base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import com.api.filters.LoggingFilter;

public class BaseService {//Wrapper for Rest Assured
	
	//BASEURI
	//Creating the request
	//Handling the response
	private static final String Base_URL="http://64.227.160.186:8080";
	private RequestSpecification requestspec;
	
	static {
		RestAssured.filters(new LoggingFilter());
	}
	
	public BaseService() {
		requestspec=RestAssured.given().baseUri(Base_URL);
		
	}
	
	protected void setAuthToken(String token) {
		requestspec.header("Authorization","Bearer "+token);
	}
	
	protected Response postRequest(Object Payload,String endpoint) {
		return requestspec.contentType(ContentType.JSON).body(Payload).post(endpoint);
	}

	protected Response getRequest(String endpoint) {
		return requestspec.get(endpoint);
	}
	
	protected Response putRequest(Object Payload,String endpoint) {
		return requestspec.contentType(ContentType.JSON).body(Payload).put(endpoint);
	}
}
