package com.supermarket.test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddExpenseTest extends BaseTest {

	
	@Test
	public void verufyUserIsAbleToAddExpense() throws AWTException, IOException {
		
		lp.login();
		hp. navigateToAddExpense();
		lep.moveToAddExpense();
		String actualMsg=lep.addExpense();
		Assert.assertEquals(actualMsg, "Expense Record Created Successfully");
		
		
		boolean photoDisplayed =lep.isUploadedPhotoExist();
		Assert.assertTrue(photoDisplayed, "pHOTO IS not Displayed");
		
		
		
	}
}
