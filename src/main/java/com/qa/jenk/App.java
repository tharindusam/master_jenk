package com.qa.jenk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeSuite;


public class App {

public WebDriver driver;
String driverPath = "D://chromedriver.exe";
String url = "https://ikman.lk";

	//@BeforeSuite
    public WebDriver setUp() {
    	System.setProperty("webdriver.chrome.driver",driverPath);
    	driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
    	return driver;
	}
}
