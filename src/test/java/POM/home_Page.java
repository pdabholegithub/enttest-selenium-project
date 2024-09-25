package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class home_Page { 
	private WebDriver driver;
	private WebDriverWait wait;
 
	@FindBy(xpath="//a[@class='button-17 cookie-consent-button w-button']")
	WebElement acceptcookies;
	public void acceptcookies() {
		acceptcookies.click();
	}

	@FindBy(xpath = "//a[@class='white-button mb-full w-inline-block']")
	WebElement WatchDemo;
	public void ClickWatchDemo() {
		WatchDemo.click();
	}
 
	
	public home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 

}
