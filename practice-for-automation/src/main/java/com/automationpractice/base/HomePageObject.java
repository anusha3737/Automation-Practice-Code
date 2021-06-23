package com.automationpractice.base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObject extends BasePageObject {

	
	

	private String pageUrl = "http://automationpractice.com/index.php";
	private By WomenLinkLocator = By.xpath("//div[@id='block_top_menu']/ul//a[@title='Women']");
	private By DressesLinkLocator = By.xpath("//div[@id='block_top_menu']/ul/li[2]/a[@title='Dresses']");
	private By TshirtLinkLocator = By.xpath("//div[@id='block_top_menu']/ul/li[3]/a[@title='T-shirts']");
	
	private By WomenMessage = By.xpath("/html//div[@id='center_column']//div[@class='content_scene_cat_bg']//strong[.='You will find here all woman fashion collections.']");
	private By DressesMessage = By.xpath("/html//div[@id='center_column']//div[@class='content_scene_cat_bg']//div[@class='rte']/p[1]");
	private By TshirtMessage = By.xpath("/html//div[@id='center_column']//div[@class='content_scene_cat_bg']//p[.='The must have of your wardrobe, take a look at our different colors,']");
	
	
	
	
	public HomePageObject(WebDriver driver, Logger log) {
		super(driver, log);
		
	}
	

	public void OpenPage() {
		log.info("Opening page: " + pageUrl);
		openURL(pageUrl);
		log.info("Page Opened");
		
	}
	
	public void clickWomen() {
		find(WomenLinkLocator).click();
		
	}
	
	public String WomenMsgText() {
		return find(WomenMessage).getText();
		}
	
	public void clickDresses() {
		find(DressesLinkLocator).click();
		
	}
	
	public String DressesMsgText() {
		return find(DressesMessage).getText();
		}
	
	public void clickTshirts() {
		find(TshirtLinkLocator).click();
	
	}
	
	public String TshirtMsgText() {
		return find(TshirtMessage).getText();
		}	
	
	
}
