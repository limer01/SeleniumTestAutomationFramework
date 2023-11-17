package com.testframework.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testframework.qa.base.TestBase;
import com.testframework.qa.pages.LoginPage;
import com.testframework.qa.pages.MyAccountPage;
import com.testframework.qa.pages.WhatsNewPage;

public class MyAccountPageTest extends TestBase {

	MyAccountPage myAccountPage;
	WhatsNewPage whatsNewPage;
	LoginPage loginPage;

	public MyAccountPageTest() {
		super();
	}

	// test cases should be separated
	// before each test case --- launch the browser and log in
	// @test --execute test case
	// after each test case close the browser

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		myAccountPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	
	 @Test() 
	 public void verifyMyAccountPageTitleTest() {
		 String title = myAccountPage.verifyMyAccountTitle();
		 Assert.assertEquals(title, "My Account", "My Account title does not match");
	}
	 

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
