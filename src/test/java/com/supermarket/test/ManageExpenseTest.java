package com.supermarket.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.supermarket.Utils.UniqueGenerator;

public class ManageExpenseTest extends BaseTest {

	@Test
	public void userIsableToCreateAndDeleteExpense() throws IOException {
	
	     lp.login();
	     hp.navigateToExpenseCategory();
	     
	     String uniqueName= UniqueGenerator.getUniqueString("Client");
	     
	     String actualCreationAlertMsg=ecp. createExpense(uniqueName);
	    
	     //Assertion for alert creation
	     Assert.assertEquals(actualCreationAlertMsg, "Expense Category Created Successfully");
	     
	     String actualDeletionAlertMsg=ecp.deleteExpense();
	     
	   //Assertion for alert deletion
	     Assert.assertEquals(actualDeletionAlertMsg, "Expense Category Deleted Successfully");
	     
	    	}
	
	
	
}
