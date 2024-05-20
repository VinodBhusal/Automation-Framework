package com.supermarket.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.supermarket.pageObjects.LoginPage;

public class LoginTest extends BaseTest {

	@Test (groups="Smoke")
	public void verifyUserIsAbleToLoginWithCredentials() throws IOException {
      
		lp.login();
		String actualBrandName = hp.getBrandName();
		Assert.assertEquals(actualBrandName, "7rmart supermarket");

	}
	
	
	
}
