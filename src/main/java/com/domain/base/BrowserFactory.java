package com.domain.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	public static WebDriver getDriver(String browser) {
		WebDriver driver = null;
		switch (browser) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					"/Users/tharindu/eclipse-workspace2/Automation/src/main/resources/geckodriver");
			driver = new FirefoxDriver();
			break;

		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"/Users/tharindu/eclipse-workspace2/Automation/src/main/resources/chromedriver");
			driver = new ChromeDriver();
			break;

		default:
			System.setProperty("webdriver.gecko.driver",
					"/Users/tharindu/eclipse-workspace2/Automation/src/main/resources/geckodriver");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		return driver;
	}

}
