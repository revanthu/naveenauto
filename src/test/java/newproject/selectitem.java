package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class selectitem {

	
	@Test
	public void fnselection(){
		
		//item select
				WebElement elephns = browser.driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[6]/a"));
				elephns.click();
				
				
				WebElement elehtc = browser.driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div[2]/div[2]/button[1]/span"));
				elehtc.click();
				
				//spare
//				WebElement elepalmtreo = browser.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/button[1]/span"));
//				elepalmtreo.click();
				
//				WebElement eleiphone = browser.driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div/div[2]/div[2]/button[1]/span"));
//				eleiphone.click();
				
				
			
	}
	
	
	@Test
	public void fncart(){
		
		
		WebElement elecart = browser.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[4]/a/span"));
		elecart.click();
		
//		WebElement elequantityup = browser.driver.findElement(By.name("quantity[2349]"));
//		elequantityup.clear();
//		elequantityup.sendKeys("10");
	}
}
