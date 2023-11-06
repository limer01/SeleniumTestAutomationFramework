package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo2 {
	
	WebDriver driver = null;
	
	
	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void googleSearch2() {
		
		driver.get("https://facebook.com");
		
	}
	
	@Test
	public void googleSearch3() {
		
		driver.get("https://yahoo.com");
		
	}
	
	
	public void tearDownTest() {
		
	}
		
	
	
	

}
