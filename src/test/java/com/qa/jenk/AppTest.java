package com.qa.jenk;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.Pages.Home;
//import com.qa.jenk.App;

public class AppTest extends App{
   
	WebDriver driver = setUp();
	public Home objHome;
	
    @Test
    @Parameters("pTitle")
    public void selectPro(String TestTitle) throws Exception {
    	objHome = new Home(driver);
    	objHome.runTest1();
    	//Assert.assertEquals(objHome.Title, "New and Used Vehicle at Best Prices in Sri Lanka");
    	Assert.assertEquals(objHome.Title, TestTitle);
    }
    
    @AfterSuite
    public void afterSuite() {
    	//driver.close();
    	
    }
}
