package Testcase;

import org.testng.annotations.*;

import Pageobject.Loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Testdata extends Base {

	@Test
	public void data() throws InterruptedException {

		Loginpage lp1 = new Loginpage(driver);
		lp1.clickproductlink();
		Thread.sleep(3000);
		lp1.clickAddproduct();
		Thread.sleep(3000);
		WebElement remove = driver.findElement(By.id("remove"));
		
		if (remove.isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		
		lp1.clickAddcarticon();
		Thread.sleep(3000);
		lp1.ccheckout();
		Thread.sleep(3000);
		lp1.fname(Fname);
		Thread.sleep(3000);
		lp1.lname(Lname);
		Thread.sleep(3000);
		lp1.zipcode(zip);
		Thread.sleep(3000);
		lp1.conting();
		Thread.sleep(3000);
		lp1.Finish();
		Thread.sleep(3000);
		lp1.backtoproduct();
		Thread.sleep(3000);
		lp1.filter();
		Thread.sleep(6000);
		 lp1.assertFilterSelected("lohi");
		lp1.filter1();
		lp1.assertFilterSelected1("hilo");
		Thread.sleep(6000);
	}

}
