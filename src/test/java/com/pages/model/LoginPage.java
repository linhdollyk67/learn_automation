package com.pages.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testdata.LoginPageData;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver dr) {
		super(dr);
		driver = dr;
}
@Test
	public CreateNewAccountPage clickCreateNewAccount() {
	
		LoginPageData lg = new LoginPageData(driver);
		WebElement emailField = driver.findElement(By.id(lg.emailBox));
		emailField.isDisplayed();
		emailField.sendKeys(lg.emailAddress);
		WebElement createAcc = driver.findElement(By.xpath(lg.createAnAccount_btn));
		createAcc.isDisplayed();
		createAcc.click();
		return new CreateNewAccountPage(driver);
	}
}

