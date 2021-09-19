package com.pages.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testdata.LoginPageData;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver dr) {
		basePage.driver = dr;
	}

	public CreateNewAccountPage clickCreateNewAccount() {

		LoginPageData lg = new LoginPageData(basePage.driver);
		WebElement emailField = basePage.driver.findElement(By.id(lg.emailBox));
		emailField.isDisplayed();
		emailField.sendKeys(lg.emailAddress);
		WebElement createAcc = basePage.driver.findElement(By.xpath(lg.createAnAccount_btn));
		createAcc.isDisplayed();
		createAcc.click();
		return new CreateNewAccountPage(basePage.driver);
	}
}
