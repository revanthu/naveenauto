package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class loginusr {
	browser obj = new browser();
	
	
	@Test
	public void fnlogin(){
		
		obj.fnweb();
		
		
		
		//login
		WebElement eleaccount=browser.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]"));
		eleaccount.click();
		
		WebElement elelogin=browser.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a"));
		elelogin.click();    
		
		WebElement eleusrname=browser.driver.findElement(By.name("email"));
		eleusrname.sendKeys("revanth12@gmail.com");
		
		WebElement eleusrpswd=browser.driver.findElement(By.name("password"));
		eleusrpswd.sendKeys("Sr123");
		
		
		WebElement eleclick=browser.driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
		eleclick.click(); 
		
		//changepassword
//		WebElement elechngpswd = browser.driver.findElement(By.linkText("Change your password"));
//		elechngpswd.click();
//		
//		WebElement elenewpswd=browser.driver.findElement(By.id("input-password"));
//		elenewpswd.sendKeys("Sr123");
//		
//		WebElement elenewpswdcnfm=browser.driver.findElement(By.id("input-confirm"));
//		elenewpswdcnfm.sendKeys("Sr123");
//		
//		WebElement elecontinue = browser.driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/input"));
//		elecontinue.click();
		
	
	}

}
