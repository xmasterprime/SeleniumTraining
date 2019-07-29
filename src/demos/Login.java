package demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) {
		// 1. Define the web driver
		System.setProperty("webdriver.chrome.driver", "//Users//dustinsison//eclipse-workspace//Software//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// 2. Open web browser, and navigate to http://sdettraining.com/trguitransactions/AccountManagement.aspx
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		// 3. Enter email address
		
		// 4. Enter password
		
		// 5. Click login
		
		// 6. Get Confirmation
		
		// 7. Close Browser
	}
}
