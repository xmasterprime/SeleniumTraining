package demos;

import org.openqa.selenium.By;
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
		driver.findElement(By.name("ctl00$MainContent$txtUserName")).sendKeys("tim@testemail.com");
		
		// 4. Enter password
		driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys("trpass");
		
		// 5. Click login
		driver.findElement(By.name("ctl00$MainContent$btnLogin")).click();
		
		// 6. Get Confirmation
		String message = driver.findElement(By.id("conf_message")).getText();
		System.out.println("Confirmation: " + message);
		
		String pageTitle = driver.getTitle();
		System.out.println("Page title test passed: Currently on " + pageTitle);
		
		// 7. Close Browser
		driver.close();
	}
}
