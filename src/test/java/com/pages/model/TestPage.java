package com.pages.model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestPage {
	public WebDriver driver;

	public void beforeTest(String browser) {
		switch (browser) {
		case "Chrome":
			System.out.println(browser);
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "Edge":
			System.out.println(browser);
			System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
			driver = new EdgeDriver();
			break;
		case "FireFox":
			System.out.println(browser);
			System.setProperty("webdriver.msedge.driver", "src/main/resources/msedgedriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Don't know how to start " + browser + "so start by Chrome");
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}

	public void afterTest() {
		driver.close();
	}

}
