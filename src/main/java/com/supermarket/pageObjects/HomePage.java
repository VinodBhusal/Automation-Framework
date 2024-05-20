package com.supermarket.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.Utils.PageActions;

public class HomePage extends PageActions {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css=".brand-link.navbar-dark span")
	WebElement brandName;
	
	@FindBy(xpath="(//*[contains(text(),'Manage Expense')])[1]")
	WebElement manageExpsene;
	
	@FindBy(xpath="(//*[contains(text(),'Manage Expense')])[2]")
	WebElement manageExpseneBtn;
	
	@FindBy(xpath="//p[contains(text(),'Expense Category')]")
	WebElement expenseCategory;
	
	@FindBy(xpath="//*[contains(text(),'Manage Delivery Boy')]")
	private WebElement manageDeliveryBoy;
	

	@FindBy(xpath="//*[contains(text(),'Manage Content')]")
	private WebElement manageContent;
	
	@FindBy(xpath="//*[contains(text(),'Manage News')]")
	private WebElement manageNews;
	
	
	
	public String getBrandName() {
		return brandName.getText();
	}
	
	public void navigateToExpenseCategory() {
		clickElement(manageExpsene);
		clickElement(expenseCategory);
		
	}
	
	public void navigateToManageDeilveryBoy() {
		clickElement(manageDeliveryBoy);
	}
	
	public void navigateToAddExpense() {
	
		clickElement(manageExpsene);
		clickElement(manageExpseneBtn);
		
	}

	
	public void navigateToNewsPage() {
		clickElement(manageContent);
		clickElement(manageNews);
		
	}
	

	
	
	
	
	
}
