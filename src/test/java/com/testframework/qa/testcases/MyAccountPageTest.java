package com.testframework.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testframework.qa.base.TestBase;
import com.testframework.qa.pages.LoginPage;
import com.testframework.qa.pages.MyAccountPage;

public class MyAccountPageTest extends TestBase{
	
	MyAccountPage myAccountPage;
	LoginPage loginPage;
	
	
	public MyAccountPageTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initialization();	 
		loginPage = new LoginPage();
		myAccountPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void verifyMyAccountPageTitleTest() {
		
		String title = myAccountPage.verifyMyAccountTitle();
		Assert.assertEquals(title, "My Account", "My Account title does not match");
	
	}

	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
