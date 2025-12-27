package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;
@Listeners(com.api.Listener.TestListener.class)
public class forgotpwd {
	@Test(description="Verify Forgotpwd API Working")
	public void forgotpwdtest() {
	
	AuthService auth=new AuthService();
	Response response=auth.forgotpwd("spoorni.be@gmail.com");
	System.out.println(response.asPrettyString());
	Assert.assertEquals(response.getStatusCode(),200);
	
	}
}

	
