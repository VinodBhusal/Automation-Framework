package com.supermarket.test;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.supermarket.Utils.TestProperties;
import com.supermarket.pageObjects.AdminUsersPage;
import com.supermarket.pageObjects.DeliveryBoyPage;
import com.supermarket.pageObjects.ExpenseCategoryPage;
import com.supermarket.pageObjects.HomePage;
import com.supermarket.pageObjects.ListExpensePage;
import com.supermarket.pageObjects.LoginPage;
import com.supermarket.pageObjects.NewsPage;

public class BaseTest {

	WebDriver driver = null;

	@BeforeMethod(alwaysRun=true)
	@Parameters({"BrowserName"})
	public void initialiseDriver(@Optional String BrowserName) throws IOException {
		
		Properties prop=TestProperties.getProperties();
		if(BrowserName==null || BrowserName.isEmpty())
		 BrowserName = prop.getProperty("browserName");
		
	    String env=	prop.getProperty("Environment");
	    String URL =prop.getProperty(env);
		System.out.println(URL);
		System.out.println("Executing tests:"+env+"Environment");
		
		if (BrowserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();

		} else if (BrowserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		else if (BrowserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Not a valid browser");
		}
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		initPages();
	}

	public LoginPage lp;
	public HomePage hp;
	public ExpenseCategoryPage ecp;
	public DeliveryBoyPage dboy;
	public NewsPage news;
	public ListExpensePage lep;
    public AdminUsersPage AdminUsers;
	public void initPages() {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		ecp= new ExpenseCategoryPage(driver);
		dboy=new DeliveryBoyPage(driver);
		news= new NewsPage(driver);
		lep = new ListExpensePage(driver);
		AdminUsers = new AdminUsersPage(driver);
	}

	@AfterMethod(alwaysRun=true)
	public void tearDown() {
	driver.quit();
	}

}
