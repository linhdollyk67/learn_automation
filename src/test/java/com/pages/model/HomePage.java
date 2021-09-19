package com.pages.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testdata.HomePageData;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver dr) {
		super(dr);
		driver = dr;
}
	@Test
	public LoginPage clickSignIn() {
		
		HomePageData hp = new HomePageData(driver);
		driver.findElement(By.xpath(hp.signIn)).isDisplayed();
		driver.findElement(By.xpath(hp.signIn)).click();
		
		return new LoginPage(driver);

	}

}
