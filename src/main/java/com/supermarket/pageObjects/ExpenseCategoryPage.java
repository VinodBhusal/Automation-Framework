package com.supermarket.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.Utils.PageActions;

public class ExpenseCategoryPage extends PageActions {

	WebDriver driver;

	public ExpenseCategoryPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "name")
	private WebElement titleInput;


	@FindBy(xpath = "//table//tbody//tr[1]/td[2]/a[2]")
	private WebElement deleteExpense;

	public String createExpense(String uniqueExpense) {
		clickElement(newBtn);
		setTextBox(titleInput, uniqueExpense);
		clickElement(saveBtn);
		String alertText = alertMsg.getText();
		return splitStringMSG(alertText);

	}

	public String deleteExpense() {
		clickElement(deleteExpense);
		acceptAlert();
		String alertText = alertMsg.getText();
		return splitStringMSG(alertText);

	}

}
