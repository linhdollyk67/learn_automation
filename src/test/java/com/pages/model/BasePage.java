package com.pages.model;

import org.openqa.selenium.WebDriver;

public class BasePage {
	public static WebDriver driver;
	public BasePage (WebDriver dr) {
		driver = dr;
	}
}
