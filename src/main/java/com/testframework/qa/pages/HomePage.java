package com.testframework.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testframework.qa.base.TestBase;

public class HomePage extends TestBase{
	
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
	
	@FindBy(xpath="Training")
	WebElement trainingPageLink;
	
	@FindBy(xpath="Sale")
	WebElement salePageLink;
	
	//initialize the Page Object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
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
