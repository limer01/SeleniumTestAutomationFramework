package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HeadlessChromeDemo {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromeDriver/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1280, 800");
			
			
		WebDriver driver = new ChromeDriver(options);
		
		//System.out.println(driver.getTitle());
				
		driver.get("https://google.com");
		driver.close();
		driver.quit();
		System.out.println("Completed");
		
		
		
		
	}

}
