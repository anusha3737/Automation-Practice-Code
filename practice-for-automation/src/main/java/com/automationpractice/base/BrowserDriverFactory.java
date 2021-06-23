package com.automationpractice.base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriverFactory {
	private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	private String browser;
	private Logger log;
	
	public BrowserDriverFactory(String browser, Logger log) {
		this.browser = browser.toLowerCase();
		this.log = log;
	}

	public WebDriver createDriver() {
		
		switch (browser) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver2.exe");
			driver.set(new ChromeDriver());
			break;
			
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\geckodriver.exe");
			driver.set(new FirefoxDriver());
			break;
			
		default:
			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver2.exe");
			driver.set(new ChromeDriver());
			break;
		
		
	}
	
	return driver.get();
}
}
