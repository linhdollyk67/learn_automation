package com.pages.model;

import org.openqa.selenium.WebDriver;

public class BasePage extends TestPage {
	TestPage basePage;

	public BasePage() {
		super();
		basePage = new TestPage();
	}

	public BasePage(WebDriver dr) {
		basePage.driver = dr;
	}
	
}
