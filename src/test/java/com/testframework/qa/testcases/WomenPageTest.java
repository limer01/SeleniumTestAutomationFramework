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
import com.testframework.qa.pages.WomenPage;

public class WomenPageTest extends TestBase{
	
	LoginPage loginPage;
	MyAccountPage myAccountPage;
	WomenPage womenPage;
	HomePage homePage;
	
	public WomenPageTest() {
		super();
	}
	

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		womenPage = new WomenPage();
		myAccountPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		womenPage = myAccountPage.womenPageLink();
	}
	
	
	@Test
	public void verifyWhatsNewPageTitleTest() {
		
		String title = womenPage.verifyWomenPageTitle();
		Assert.assertEquals(title, "Women", "Women page title does not match");
		
	} 
	
	
	@Test
	public void verifyWhatsNewPageTitleTest2() {
		
		String title = womenPage.verifyWomenPageTitle();
		Assert.assertEquals(title, "Women", "Women page title does not match");
		
	}
	
	
	@Test
	public void verifyWhatsNewPageTitleTest3() {
		
		String title = womenPage.verifyWomenPageTitle();
		Assert.assertEquals(title, "Women", "Women page title does not match");
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
