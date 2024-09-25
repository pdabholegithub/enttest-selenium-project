package ent_test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ent_utility.constant;


public class Test_base_class {

    protected WebDriver driver;
    private String baseUrl;

    @Test
    public void setUp() throws IOException {
    	
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
       
        constant constants= new constant();
        
        baseUrl=constants.BASE_URL;
        driver.get(baseUrl);
    }

    @AfterMethod
    public void TearDown() {
        driver.quit();
    }
}
