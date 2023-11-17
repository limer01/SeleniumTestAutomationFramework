package com.testframework.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testframework.qa.base.TestBase;
import com.testframework.qa.pages.HomePage;
import com.testframework.qa.pages.LoginPage;
import com.testframework.qa.pages.MyAccountPage;
import com.testframework.qa.pages.WhatsNewPage;

public class WhatsNewPageTest extends TestBase{
	
	LoginPage loginPage;
	MyAccountPage myAccountPage;
	WhatsNewPage whatsNewPage;
	HomePage homePage;
	
	public WhatsNewPageTest() {
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		whatsNewPage = new WhatsNewPage();
		myAccountPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		whatsNewPage = myAccountPage.whatsNewPageLink();
	}
	
	
	@Test
	public void verifyWhatsNewPageTitleTest() {
		
		String title = whatsNewPage.verifyWhatsNewPageTitle();
		Assert.assertEquals(title, "What's New", "Whats New page title does not match");
		
	}
	
	@Test
	public void verifyWhatsNewPageTitleTest2() {
		
		String title = whatsNewPage.verifyWhatsNewPageTitle();
		Assert.assertEquals(title, "What's New", "Whats New page title does not match");
		
	}
	
	@Test
	public void verifyWhatsNewPageTitleTest3() {
		
		String title = whatsNewPage.verifyWhatsNewPageTitle();
		Assert.assertEquals(title, "What's New", "Whats New page title does not match");
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
