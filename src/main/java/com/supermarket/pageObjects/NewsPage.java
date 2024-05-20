package com.supermarket.pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.Utils.PageActions;
import com.supermarket.Utils.UniqueGenerator;


public class NewsPage extends PageActions{

	private WebDriver driver;
	
	public NewsPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#news")
	private WebElement newsInput;
	
	@FindBy(css = "[name='create']")
	protected WebElement saveBtn;
	
	public String validateNewsIsCreated() {
		clickElement(newBtn);
		setTextBox(newsInput, UniqueGenerator.getCurrentDateTime().toString());
		clickElement(saveBtn);
		String alertText=alertMsg.getText();
		return splitStringMSG(alertText);
		
	}

	
}

