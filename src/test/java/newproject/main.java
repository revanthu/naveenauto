package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		browser obj = new browser();
		loginusr objusr = new loginusr();
		selectitem objsel = new selectitem();
		checkout objcheck = new checkout();
		logout objlgout = new logout();
		wishlist objlist = new wishlist();
		
		
		
		obj.fnweb();
		objusr.fnlogin();
		objsel.fnselection();
		objsel.fncart();
		objcheck.fnchkout();
		objcheck.fnpaydetails();
		objcheck.fndelivarydetails();
		objcheck.fnshippingdetails();
		objcheck.fnpayconfirmation();
		objlgout.fnsignout();
		objlist.fnwishlistselction();
		
	}
}
