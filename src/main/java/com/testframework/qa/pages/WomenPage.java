package com.testframework.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testframework.qa.base.TestBase;

public class WomenPage extends TestBase{
	
	@FindBy(xpath="//a[@class='logo']/img")
	WebElement homePageIcon;
	
	@FindBy(xpath="//span[text()=\"What's New\"]")
	WebElement whatsNewPageLink;
	
	@FindBy(xpath="//span[text()='Men']")
	WebElement menPageLink;
	
	@FindBy(xpath="//span[text()='Gear']")
	WebElement gearPageLink;
	
	@FindBy(xpath="Training")
	WebElement trainingPageLink;
	
	@FindBy(xpath="Sale")
	WebElement salePageLink;
	
	
	
	public WomenPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String verifyWomenPageTitle(){
		return driver.getTitle();
	}
	
	public HomePage homePageLink() {
		homePageIcon.click();
		return new HomePage();
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
