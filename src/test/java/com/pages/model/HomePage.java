package com.pages.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testdata.HomePageData;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver dr) {
		basePage.driver = dr;
}
	public LoginPage clickSignIn() {
		
		HomePageData hp = new HomePageData(basePage.driver);
		basePage.driver.findElement(By.xpath(hp.signIn)).isDisplayed();
		basePage.driver.findElement(By.xpath(hp.signIn)).click();
		
		return new LoginPage(basePage.driver);

	}

}
