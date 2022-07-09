package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class checkout {

	
	browser obj = new browser();
	loginusr objusr = new loginusr();
	
	
	@Test
	public void fnchkout(){
		
		WebElement elecheckout = browser.driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[2]/a"));
		elecheckout.click();
	}
	
	@Test
	public void fnpaydetails(){
		
		WebElement elennext=browser.driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/form/div[3]/label"));
		elennext.click();
		
		WebElement elefname=browser.driver.findElement(By.name("firstname"));
		elefname.sendKeys("revanth");
		
		WebElement elelname=browser.driver.findElement(By.name("lastname"));
		elelname.sendKeys("uppu");
		
		WebElement elead1=browser.driver.findElement(By.name("address_1"));
		elead1.sendKeys("revanth12@gmail.com");
		
		WebElement elecity=browser.driver.findElement(By.name("city"));
		elecity.sendKeys("watford");
		
		WebElement elepostcode=browser.driver.findElement(By.name("postcode"));
		elepostcode.sendKeys("wd173re");
		
		WebElement elecountry=browser.driver.findElement(By.name("country_id"));
		Select objsel = new Select(elecountry);
		objsel.selectByValue("81");
		
		WebElement elezoneid=browser.driver.findElement(By.name("zone_id"));
		Select objselzone = new Select(elezoneid);
		objselzone.selectByValue("1255");
		
	}
	
	
	@Test
	public void fndelivarydetails(){
		
			
		WebElement elennext1=browser.driver.findElement(By.id("button-payment-address"));
		elennext1.click();
		
		WebElement eledelivarydetailsinfo=browser.driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div[2]/div/form/div[1]/label"));
		eledelivarydetailsinfo.click();
		
	}
	
	@Test
	public void fnshippingdetails(){
		
		WebElement elennext2=browser.driver.findElement(By.id("button-shipping-address"));
		elennext2.click();
		
		WebElement elennext3=browser.driver.findElement(By.id("button-shipping-method"));
		elennext3.click();
		
		WebElement elennext4=browser.driver.findElement(By.name("agree"));
		elennext4.click();
	}
	
	
	@Test
	public void fnpayconfirmation(){
		
		
		WebElement elennext5=browser.driver.findElement(By.id("button-payment-method"));
		elennext5.click();
		
		WebElement eleconform=browser.driver.findElement(By.id("button-confirm"));
		eleconform.click();
	}
}
