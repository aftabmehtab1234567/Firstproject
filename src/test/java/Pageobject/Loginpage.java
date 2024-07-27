package Pageobject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Loginpage {
	WebDriver ldriver;

	public Loginpage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "user-name")
	WebElement txtUsername;

	@FindBy(name = "password")
	WebElement txtPassword;

	@FindBy(name = "login-button")
	WebElement btnLogin;
	@FindBy(id = "item_4_title_link")
	WebElement productlink;
	@FindBy(id = "add-to-cart")
	WebElement Addtocart;
	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
	WebElement Addtocarticon;
	@FindBy(id = "checkout")
	WebElement check;
	@FindBy(name = "firstName")
	WebElement fname;
	@FindBy(name = "lastName")
	WebElement lname;
	@FindBy(name = "postalCode")
	WebElement zip;
	@FindBy(xpath = "//*[@id=\"continue\"]")
	WebElement contin;
	@FindBy(name = "finish")
	WebElement Finish;
	@FindBy(name="back-to-products")
	WebElement backtoproduct;
	@FindBy(name="back-to-products")
	WebElement back;
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/div/span/select")
	WebElement filt;

	public void setUserName(String uName) {
		txtUsername.sendKeys(uName);
	}

	public void setPassword(String pass) {
		txtPassword.sendKeys(pass);
	}

	public void clickLogin() {
		btnLogin.click();
	}

	public void clickproductlink() {
		productlink.click();
	}

	public void clickAddproduct() {
		Addtocart.click();
		
	}

	public void clickAddcarticon() {
		Addtocarticon.click();
	}

	public void ccheckout() {
		check.click();
	}

	public void fname(String Fname) {
		fname.sendKeys(Fname);
	}

	public void lname(String Lname) {
		lname.sendKeys(Lname);

	}

	public void zipcode(String Zip) {
		zip.sendKeys(Zip);
	}

	public void conting() {
		contin.click();
	}

	public void Finish() {
		Finish.click();
	}
	public void backtoproduct() {
		backtoproduct.click();
	}
	public void backhome() {
		back.click();
	}
	public void filter() {
	Select drop=new Select(filt);
	drop.selectByValue("lohi");
	}
	public String getselectfilter() {
Select drop =new Select(filt);
		return drop.getFirstSelectedOption().getAttribute("value");
		
	}
	public void assertFilterSelected(String expectedValue) {
		assertEquals(expectedValue, getselectfilter());
	}
	public void filter1() {
		Select drop=new Select(filt);
		drop.selectByValue("hilo");
		}
	public String getselectfilter1() {
		Select drop =new Select(filt);
				return drop.getFirstSelectedOption().getAttribute("value");
				
			}
			public void assertFilterSelected1(String expectedValue) {
				assertEquals(expectedValue, getselectfilter1());
			}
	
}
