package com.supermarket.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.supermarket.Utils.ExcelReader;
import com.supermarket.Utils.UniqueGenerator;

public class AdminTest extends BaseTest {
	
	
	
	@Test(groups="Smoke")
	public void myadminTest() throws IOException {
		String username =ExcelReader.getCellvalue(1, 0)+UniqueGenerator.getRandomNumber(); 
		String password =ExcelReader.getCellvalue(1, 1)+UniqueGenerator.getRandomNumber(); ;
		String usertype =ExcelReader.getCellvalue(1, 2);
		lp.login();
		
		AdminUsers.createAdminUsers(username, password, usertype);
		
	}

}
