package com.pages.test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pages.model.BasePage;
import com.pages.model.HomePage;
import com.pages.model.LoginPage;

@Test
public class MainTest extends BasePage{

	public MainTest(WebDriver dr) {
		super(dr);
		HomePage homepage = new HomePage(driver);
		homepage.clickSignIn();
		LoginPage login = new LoginPage(driver);
		login.clickCreateNewAccount();
	}
	
}