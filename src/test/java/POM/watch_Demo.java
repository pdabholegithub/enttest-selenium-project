package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import ent_utility.constant;

public class watch_Demo{

	private WebDriver driver;
	private WebDriverWait wait;
 
	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement FirstName;
	public void EnterFirstName() {
		FirstName.sendKeys(constant.FIRST_NAME);
	}
 
	@FindBy(xpath = "//input[@id='LastName']")
	WebElement LastName;
	public void EnterLastName() {
		LastName.sendKeys(constant.LAST_NAME);
	}
	@FindBy(xpath = "//input[@id='Email']")
	WebElement Email;
	public void EnterEmail() {
		Email.sendKeys(constant.EMAIL);
	}
	@FindBy(xpath = "//input[@id='Company']")
	WebElement CompanyName;
	public void EnterCompanyName() {
		CompanyName.sendKeys(constant.COMPANY);
	}
	@FindBy(xpath = "//input[@id='Phone']")
	WebElement PhoneNumber;
	public void EnterPhoneNumber() {
		PhoneNumber.sendKeys(constant.PHONE_NUMBER);
	}
	@FindBy(xpath = "//select[@id='Unit_Count__c']")
	WebElement UnitCount;
	public void SelectUnitCount() {
		Select select = new Select(UnitCount);
		select.selectByVisibleText(constant.UNIT_COUNT);;	
	}
	@FindBy(xpath = "//input[@id='Title']")
	WebElement JobTitle;
	public void EnterJobTitle() {
		JobTitle.sendKeys(constant.JOB_TITLE);
	}
	@FindBy(xpath = "//select[@id='demoRequest']")
	WebElement person;
	public void selectperson() {
		Select select = new Select(UnitCount);
		select.selectByVisibleText(constant.SELECT_PERSON);
	}

	public watch_Demo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
