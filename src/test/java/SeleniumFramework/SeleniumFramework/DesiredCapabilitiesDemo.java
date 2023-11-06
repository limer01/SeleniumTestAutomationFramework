package SeleniumFramework.SeleniumFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", projectPath+"" );

		
		WebDriver driver = new InternetExplorerDriver();
		
		
	}

}
