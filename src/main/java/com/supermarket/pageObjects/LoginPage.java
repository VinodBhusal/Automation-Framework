package com.supermarket.pageObjects;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.Utils.PageActions;
import com.supermarket.Utils.TestProperties;

public class LoginPage extends PageActions {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@name='username']")
	private WebElement username;
	
	@FindBy(css="[name='password']")
	private WebElement password;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement signInBtn;
	
	public void login() throws IOException {
		Properties prop=TestProperties.getProperties();
		
		setTextBox(username, prop.getProperty("username"));
		setTextBox(password, prop.getProperty("password"));
		clickElement(signInBtn);
		
		
	}

}
