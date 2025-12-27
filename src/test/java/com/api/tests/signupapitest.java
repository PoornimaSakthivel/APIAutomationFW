package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.signuprequest;

import io.restassured.response.Response;

@Listeners(com.api.Listener.TestListener.class)
public class signupapitest {
	@Test(description="Verify SignUp API Working")
	public void signuptest() {
		signuprequest	signupreq =new signuprequest.Bulider().Username("Kelvin1").email("test1243@gmail.com").
		password("Pass@123").firstName("TEST").lastName("ACC").mobileNumber(1234234566).build();
		
		
		AuthService auth=new AuthService();
		
		Response rep=auth.signup(signupreq);	
		Assert.assertEquals(rep.asPrettyString(), "User registered successfully!");
		
		
	}
}
