package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import config.PropertiesFile;

public class ExcelDataProvider {
	
	WebDriver driver =null;
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromeDriver/chromedriver.exe");
		driver = new ChromeDriver();		
	}
	
	@Test(dataProvider="test1Data")
	public void test1(String userName, String password) throws InterruptedException {
		System.out.println(userName+ " | "+password);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		Thread.sleep(2000);
	
	}
	
	 @DataProvider(name = "test1Data")
	 public Object[][] getData() {
		 String excelPath = "C:\\Users\\lalor\\automation_framework\\SeleniumFramework\\Excel\\data.xlsx";
		 Object data[][] = testData(excelPath, "Tabelle1");
		 return data;
	 }
	 
	 
	public Object[][] testData(String excelPath, String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();

		Object data[][] = new Object[rowCount-1][colCount];
		
		
		for(int i = 1; i<rowCount; i++) {
			for(int j = 0; j<colCount; j++) {
				String cellData = excel.getCellDataString(i, j);
				System.out.print(cellData+" | ");
				data[i-1][j] = cellData;
			}
			System.out.println();
		}
		
		return data;
	}

}
