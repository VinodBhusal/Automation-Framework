package com.supermarket.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewsTest extends BaseTest {

	@Test
	public void createNews() throws IOException {
		
		lp.login();
		hp.navigateToNewsPage();
		String creationAlert=news.validateNewsIsCreated();
		Assert.assertEquals(creationAlert, "News Created Successfully");
	
	
	}
}
