package com.automationpractice.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

protected WebDriver driver;
protected Logger log;
	@Parameters({"browser"})
	@BeforeMethod(alwaysRun=true)
	public void openChrome(@Optional String browser, ITestContext ctx) {
		
		String testName = ctx.getCurrentXmlTest().getName();
		log = LogManager.getLogger(testName);
		
		BrowserDriverFactory factory = new BrowserDriverFactory(browser,log);
		driver = factory.createDriver();
		
		
			driver.manage().window().maximize();
			
		
	}
	
	@AfterMethod(alwaysRun=true)
	public void quit() {
		
		driver.quit();
		
	}
	
	public void sleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
