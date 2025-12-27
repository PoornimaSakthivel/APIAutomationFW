package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.models.request.loginrequest;
import com.api.models.response.loginresponse;
import com.api.models.response.userprofileresponse;

import io.restassured.response.Response;
@Listeners(com.api.Listener.TestListener.class)
public class getprofiletest {
	@Test(description="Verify GetProfile API Working")
	public void getprofiletest() {
		AuthService auth=new AuthService();
		loginrequest loginreq=new loginrequest("poornimatest","London@32");
		Response response=auth.login(loginreq);	
		loginresponse loginres=response.as(loginresponse.class);
		System.out.println(loginres.getToken());
		
		UserManagementService UserManagementServ=new UserManagementService();
		response=UserManagementServ.getprofile(loginres.getToken());
		userprofileresponse userprofresponse=response.as(userprofileresponse.class);
		System.out.println(userprofresponse.getUsername());
		Assert.assertEquals(userprofresponse.getUsername(),"poornimatest");
		//loginresponse loginres=response.as(loginresponse.class);
		
}
}