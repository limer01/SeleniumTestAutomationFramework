package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import demo.Log4Demo;

public class TestNgDemo {
	
	WebDriver driver = null;
	public static String browserName=null;
	private static Logger logger = LogManager.getLogger(Log4Demo.class);
	
	
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();

		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromeDriver/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("fireFox")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/geckoDriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		logger.info("Browser Started");
	}
	
	@Test
	public void googleSearch() {
		
		driver.get("https://google.com");
		
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
	System.out.println("Test Completed Succesfully");
	}
		
	
	
	

}
