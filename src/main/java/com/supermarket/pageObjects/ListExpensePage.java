package com.supermarket.pageObjects;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.Context.Constants;
import com.supermarket.Utils.PageActions;
import com.supermarket.Utils.UniqueGenerator;


public class ListExpensePage extends PageActions {

	WebDriver driver;

	public ListExpensePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "name")
	private WebElement titleInput;
	

	@FindBy(id = "user_id")
	private WebElement userDropdown;
	
	@FindBy(id = "ex_type")
	private WebElement expenseDropdown;

	@FindBy(id = "amount")
	private WebElement amountInput;
	
	@FindBy(css = "[name='create']")
	private WebElement saveBtn;
	
	@FindBy(css = "[name='userfile']")
	private WebElement chooseFile;
	
	@FindBy(xpath = "//table//tbody//tr[1]/td[8]//a")
	private WebElement imageOpenArrow;
	
	
	@FindBy(xpath = "//*[@class='detail-row open']//*[@class='profile-info-name']")
	private WebElement uploadedPhoto;
	
	@FindBy(xpath="(//*[contains(text(),'Manage Expense')])[2]")
	WebElement manageExpseneBtn;
	

	@FindBy(xpath = "//table//tbody//tr[1]/td[2]/a[2]")
	private WebElement deleteExpense;

	
	public void moveToAddExpense() {
		clickElement(newBtn);
	}
	
	public String addExpense() throws AWTException {
		handleStaticDropdown(userDropdown, "Admin(Admin)");
		handleStaticDropdown(expenseDropdown, "Credit Bank");
		setTextBox(amountInput, UniqueGenerator.getRandomNumber());
		scrollToBottomofPage();
		uploadImage(chooseFile, Constants.IMAGEPATH);
		clickElement(saveBtn);
		String alertText = alertMsg.getText();
		return splitStringMSG(alertText);
		
	}
	
	
	public boolean isUploadedPhotoExist() {
		clickElement(manageExpseneBtn);
		javascriptClickElement(imageOpenArrow);
		waitUntilVisible(uploadedPhoto);
		return 	isElementDisplayed(uploadedPhoto);
		
	}

}
