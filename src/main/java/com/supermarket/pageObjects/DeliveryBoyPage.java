package com.supermarket.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.Utils.PageActions;

public class DeliveryBoyPage extends PageActions {

	WebDriver driver;

	public DeliveryBoyPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "name")
	private WebElement name;
	
	@FindBy(id = "username")
	private WebElement userName;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(css = "[name='create']")
	private WebElement saveBtn;
	
	
	public String createDeliverBoy(String nameVal, String usernameVal,  String passwordVal) throws InterruptedException {
		
		clickElement(newBtn);
		setTextBox(name, nameVal);
		setTextBox(userName, usernameVal);
		setTextBox(password,passwordVal);
		scrollToBottomofPage();
		javascriptClickElement(saveBtn);
		String alertText = alertMsg.getText();
		return splitStringMSG(alertText);
		

	}



}
