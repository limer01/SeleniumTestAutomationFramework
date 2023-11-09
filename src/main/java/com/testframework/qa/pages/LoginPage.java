package com.testframework.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testframework.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory
	@FindBy(name="login[userName]")
	WebElement userName;
	
	@FindBy(name="login[passWord]")
	WebElement password;
	
	@FindBy(xpath="//button/span[text()=\"Sign In\"]")
	WebElement signinBtn;
	
	@FindBy(xpath="//button/span[text()=\"Create an Account\"]")
	WebElement cBtn;
	
	
	//initialize the pAGE oBJECTS
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pwd) {
		userName.sendKeys(un);
		password.sendKeys(pwd);
		signinBtn.click();
		
		return new HomePage();
	}

}
