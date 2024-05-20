package com.supermarket.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.Utils.PageActions;

public class AdminUsersPage extends PageActions {

	WebDriver driver;
	
	public AdminUsersPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}


	public void createAdminUsers(String username, String password, String usertype){
		
	}
	
}
