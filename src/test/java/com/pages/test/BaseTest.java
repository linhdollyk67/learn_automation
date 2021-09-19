package com.pages.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.pages.model.TestPage;

public class BaseTest extends TestPage {
	TestPage basePage;

	public BaseTest() {
		super();
		basePage = new TestPage();
	}

	public BaseTest(WebDriver dr) {
		basePage.driver = dr;
	}

	@BeforeMethod
	// Parameter will get browser from testng.xml on which browser test to run
	@Parameters("browser")
	public void openBrowser(String browser) {
		System.out.println(browser);
		basePage.beforeTest("Chrome");
	}

	@AfterMethod
	void closeBrowser() {
		basePage.driver.manage().deleteAllCookies();
		basePage.afterTest();
	}
	
}
