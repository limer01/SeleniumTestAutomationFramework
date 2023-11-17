package com.testframework.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testframework.qa.base.TestBase;

public class MyAccountPage extends TestBase{
	
	@FindBy(xpath="//a[@class='logo']/img")
	WebElement homePageIcon;
	
	@FindBy(xpath="//span[text()=\"What's New\"]")
	WebElement whatsNewPageLink;
	
	@FindBy(xpath="//span[text()='Women']")
	WebElement womenPageLink;
	
	@FindBy(xpath="//span[text()='Men']")
	WebElement menPageLink;
	
	@FindBy(xpath="//span[text()='Gear']")
	WebElement gearPageLink;
	
	@FindBy(xpath="//span[text()='Training']")
	WebElement trainingPageLink;
	
	@FindBy(xpath="//span[text()='Sale']")
	WebElement salePageLink;
	
	
	@FindBy(xpath="//span[text()=\"Welcome, Test Test!\"]")
	WebElement welcomeUserNameTxt;
	
	@FindBy(xpath="//address[1]")
	WebElement address;	
	
	
	
	
	//initialize the Page Object
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyAddress() {
		return address.toString();
	}
	
		
	public String verifyMyAccountTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyHeaderUserName() {
		return welcomeUserNameTxt.isDisplayed();
	}
	
	public HomePage homePageLink() {
		homePageIcon.click();
		return new HomePage();
	}
	
	public WhatsNewPage whatsNewPageLink() {
		whatsNewPageLink.click();
		return new WhatsNewPage();
	}
	
	public WomenPage womenPageLink() {
		womenPageLink.click();
		return new WomenPage();
	}
	
	public MenPage menPageLink() {
		menPageLink.click();
		return new MenPage();
	}
	
	public GearPage gearPageLink() {
		gearPageLink.click();
		return new GearPage();
	}
	
	public TrainingPage trainingPageLink() {
		trainingPageLink.click();
		return new TrainingPage();
	}
	
	public SalePage salePageLink() {
		salePageLink.click();
		return new SalePage();
	}

}
