package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	WebDriver driver;
	public String Title;
	
	@FindBy(xpath = "//*[contains(@href,'/en/ads/sri-lanka/vehicles')]")
	WebElement selectProvince;
	
	
	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public String selectYourProvince() {
		
		selectProvince.click();
		Title = driver.getTitle();
		return Title;
	}
	
	public void runTest1() {
		
		this.selectYourProvince();
	}

}
