package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	WebElement back;

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
	public void backhome() {
		back.click();
	}
}
