package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class wishlist {

	browser obj = new browser();
	
	@Test

	public void fnwishlistselction(){
		
		obj.fnweb();
		//login-again
				WebElement eleaccount1=browser.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]"));
				eleaccount1.click();
				
				WebElement elelogin1=browser.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a"));
				elelogin1.click();    
				
				WebElement eleusrname1=browser.driver.findElement(By.name("email"));
				eleusrname1.sendKeys("revanth12@gmail.com");
				
				WebElement eleusrpswd1=browser.driver.findElement(By.name("password"));
				eleusrpswd1. sendKeys("Sr123");
				
				WebElement eleclick=browser.driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
				eleclick.click(); 
				
				WebElement elewishlist=browser.driver.findElement(By.xpath("/html/body/footer/div/div/div[4]/ul/li[3]/a"));
				Actions obja = new Actions(browser.driver);
				obja.moveToElement(elewishlist).build().perform();
				
				
				//browser.driver.quit();
	}
}
