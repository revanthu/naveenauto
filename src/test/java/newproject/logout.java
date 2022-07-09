package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class logout {

	
	
	browser obj = new browser();
	loginusr objusr = new loginusr();
	
	
	@Test
	public void fnsignout(){
		
		//logout
				WebElement eleaccountback=browser.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]"));
				eleaccountback.click();
				
				WebElement elelogout=browser.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a"));
				elelogout.click();
				
				WebElement eledone=browser.driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/a"));
				eledone.click();
	}
}
