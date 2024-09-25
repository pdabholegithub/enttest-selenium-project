package ent_test;

import org.testng.annotations.Test;

import POM.home_Page;
import POM.watch_Demo;

public class test_Watch_Demo extends Test_base_class{
	 
		@Test
		public void watchdemo()
		{
			home_Page homePage = new home_Page(driver);
			watch_Demo watchdemoPage = new watch_Demo(driver);
			homePage.acceptcookies();
			homePage.ClickWatchDemo();
			watchdemoPage.EnterFirstName();
			watchdemoPage.EnterLastName();
			watchdemoPage.EnterEmail();
			watchdemoPage.EnterCompanyName();
			watchdemoPage.EnterPhoneNumber();
			watchdemoPage.SelectUnitCount();
			watchdemoPage.EnterJobTitle();
//			watchdemoPage.selectperson();
			
//			String ExpectedURL = "https://api.razorpay.com/";
//			String ActualURL = driver.getCurrentUrl();
//			SoftAssert Assertion = new SoftAssert();
//			Assertion.assertEquals(ExpectedURL,"PASS");
//			Assertion.assertAll();
		}	
	 

}
