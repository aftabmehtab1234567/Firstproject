package Testcase;

import org.testng.annotations.Test;
import Pageobject.Loginpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Utilities.Readconfig;

public class Testdata extends Base {
    Readconfig config = new Readconfig();

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
    }

    @Test
    public void payment() throws InterruptedException {
        Loginpage lp1 = new Loginpage(driver);
        lp1.clickAddcarticon();
        Thread.sleep(3000);
        lp1.ccheckout();
        Thread.sleep(3000);
        lp1.fname(config.Fname());
        Thread.sleep(3000);
        lp1.lname(config.Lname());
        Thread.sleep(3000);
        lp1.zipcode(config.Zipcode());
        Thread.sleep(3000);
        lp1.conting();
        Thread.sleep(3000);
        lp1.Finish();
        Thread.sleep(3000);
        lp1.backtoproduct();
        Thread.sleep(3000);
    }

    @Test
    public void dropdown() throws InterruptedException {
        Loginpage lp1 = new Loginpage(driver);
        Thread.sleep(3000);
        lp1.filter();
        Thread.sleep(6000);
        lp1.assertFilterSelected("lohi");
        lp1.filter1();
        lp1.assertFilterSelected1("hilo");
        Thread.sleep(6000);
    }
}
