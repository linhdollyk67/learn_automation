package com.pages.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class BaseTest {
	public WebDriver driver;
	@Parameters({ "browser"})
	@BeforeMethod(alwaysRun = true)
	private void beforeTest(@Optional("Chrome") String browser) {
		switch (browser) {
			case "Chrome":
				System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "Edge":
				System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
				driver = new EdgeDriver();
				break;
			case "FireFox":
				System.setProperty("webdriver.msedge.driver", "src/main/resources/msedgedriver.exe");
				driver = new FirefoxDriver();
				break;
			default:
				System.out.println("Don't know how to start " + browser + "so start by Chrome");
				System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
				driver = new ChromeDriver();
				break;
		}
	}
	
	@AfterMethod
	private void afterTest() {
		driver.close();
	}

}

