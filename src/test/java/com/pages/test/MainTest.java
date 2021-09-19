package com.pages.test;

import org.testng.annotations.Test;

import com.pages.model.HomePage;
import com.pages.model.LoginPage;

public class MainTest extends BaseTest {

	@Test
	public void test() {
		HomePage homepage = new HomePage(basePage.driver);
		homepage.clickSignIn();
		LoginPage login = new LoginPage(basePage.driver);
		login.clickCreateNewAccount();

	}

}