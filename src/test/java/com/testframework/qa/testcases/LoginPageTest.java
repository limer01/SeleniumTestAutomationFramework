package com.testframework.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testframework.qa.base.TestBase;
import com.testframework.qa.pages.HomePage;
import com.testframework.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();		
		
	}
	
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = LoginPage.validateLoginPageTitle();
		//change this as its wrong added for testing
		Assert.assertEquals(title, "Home Page");
	}
	
	/*
	 * @Test(priority=2) public void loginTest() { homePage =
	 * loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	 * }
	 */
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
