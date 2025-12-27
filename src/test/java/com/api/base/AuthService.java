package com.api.base;

import java.util.HashMap;

import com.api.models.request.loginrequest;
import com.api.models.request.profilerequest;
import com.api.models.request.signuprequest;

import io.restassured.response.Response;

public class AuthService extends BaseService {
	private final static String BASE_PATH="/api/auth/";
	
		




	public Response login(loginrequest loginreq) {
		// TODO Auto-generated method stub
		return postRequest(loginreq,BASE_PATH+"login");
	}
	
	public Response signup(signuprequest signupreq) {
		// TODO Auto-generated method stub
		return postRequest(signupreq,BASE_PATH+"signup");
	}

	public Response forgotpwd(String emailaddress) {
		// TODO Auto-generated method stub
		HashMap<String,String> forgotpwdrequest=new HashMap<>();
		forgotpwdrequest.put("email", emailaddress);		
		return postRequest(forgotpwdrequest,BASE_PATH+"forgot-password");
	}

	
	
}
