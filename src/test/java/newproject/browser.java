package newproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class browser {

	
	
	public static WebDriver driver;
	@Test
	public void fnweb(){
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasid\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.navigate().to("https://naveenautomationlabs.com/opencart/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
}
