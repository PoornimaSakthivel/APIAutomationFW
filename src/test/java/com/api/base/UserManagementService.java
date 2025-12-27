package com.api.base;

import com.api.models.request.profilerequest;

import io.restassured.response.Response;

public class UserManagementService extends BaseService{
	private final static String BASE_PATH="/api/users/";
	
	public Response getprofile(String token) {
		// TODO Auto-generated method stub
		setAuthToken(token);
		return getRequest(BASE_PATH+"profile");
	}
	public Response updateprofile(String token,profilerequest profilereq) {
		setAuthToken(token);
		return putRequest(profilereq,BASE_PATH+"profile");
	}
}
