package com.supermarket.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.supermarket.Utils.UniqueGenerator;

public class CreateDeliveryBoyTest extends BaseTest {

	@Test(dataProvider="getData")
	public void verifyUserIsAbleToCreateMultipleDeliveryBoys(String nameVal,String usernameVal,  String passwordVal) throws InterruptedException, IOException {
		lp.login();
		hp.navigateToManageDeilveryBoy();
		String actualDeliveryBoyText=dboy.createDeliverBoy(nameVal, usernameVal, passwordVal);
	
	     Assert.assertEquals(actualDeliveryBoyText, "Delivery Boy Details Created Successfully");
	}
	
	
	
	@DataProvider
	public String[][] getData() {
		String[][] data = new String[2][3];
		data[0][0]= UniqueGenerator.getUniqueString("Romy24");
		data[0][1]=UniqueGenerator.getUniqueString("Romy")+UniqueGenerator.getRandomNumber();
		data[0][2]= UniqueGenerator.getUniqueString("mypassword");
		
		data[1][0]= UniqueGenerator.getUniqueString("Romy24");
		data[1][1]= "Niteesha"+ UniqueGenerator.getRandomNumber();
		data[1][2]= UniqueGenerator.getUniqueString("mypassword");

	
		return data;
		
	}
}
