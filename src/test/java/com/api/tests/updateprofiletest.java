package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.models.request.loginrequest;
import com.api.models.request.profilerequest;
import com.api.models.response.loginresponse;
import com.api.models.response.userprofileresponse;

import io.restassured.response.Response;
@Listeners(com.api.Listener.TestListener.class)
public class updateprofiletest {
	@Test(description="Verify Update Profile API Working")
	public void updateprofiletest() {
		AuthService auth=new AuthService();
		loginrequest loginreq=new loginrequest("poornimatest","London@32");
		Response response=auth.login(loginreq);	
		System.out.println(response.asPrettyString());
		loginresponse loginres=response.as(loginresponse.class);
		System.out.println(loginres.getToken());
		System.out.println("------------------------------------------------------------------");
		
		UserManagementService UserManagementServ=new UserManagementService();
		response=UserManagementServ.getprofile(loginres.getToken());
		System.out.println(response.asPrettyString());
		System.out.println("------------------------------------------------------------------");
		profilerequest profilereq=new profilerequest.Builder().firstName("poornimatest").lastName("test").email("spoorni.be@gmail.com")
				.mobileNumber(1334190890).build();
		response=UserManagementServ.updateprofile(loginres.getToken(),profilereq);
		//response=UserManagementServ.getprofile(loginres.getToken());
		//userprofileresponse userprofresponse=response.as(userprofileresponse.class);
		//System.out.println(userprofresponse.getUsername());
		System.out.println(response.asPrettyString());
		System.out.println("------------------------------------------------------------------");
		Assert.assertEquals(response.getStatusCode(), 200);
}
}
