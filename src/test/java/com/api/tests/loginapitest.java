package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.loginrequest;
import com.api.models.response.loginresponse;

import io.restassured.response.Response;

@Listeners(com.api.Listener.TestListener.class)
public class loginapitest {

	@Test(description="Verify Login API Working")
	public void logintest() {
		AuthService auth=new AuthService();
		loginrequest loginreq=new loginrequest("poornimatest","London@32");
		Response response=auth.login(loginreq);	
		loginresponse loginres=response.as(loginresponse.class);
		
		System.out.println(loginres.getEmail());	
		System.out.println(loginres.getUsername());
		System.out.println(loginres.getToken());
		Assert.assertEquals(loginres.getEmail(), "spoorni.be@gmail.com");
		Assert.assertEquals(loginres.getUsername(), "poornimatest");
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertTrue(loginres.getToken()!=null);
	}
}
