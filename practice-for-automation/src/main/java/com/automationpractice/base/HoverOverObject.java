package com.automationpractice.base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HoverOverObject extends BasePageObject{

	private By WomenLinkHover = By.xpath("//div[@id='block_top_menu']/ul//a[@title='Women']");
	private By getWomenTitle = By.xpath("//div[@id='block_top_menu']/ul/li[1]/ul//a[@title='Tops']");
	private By tshirtLinkTitle = By.xpath("//div[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul//a[@title='T-shirts']");
	
	public HoverOverObject(WebDriver driver, Logger log) {
		super(driver,log);
	}
	
	public void womenHover() {
		//hover over women link
		
		WebElement HoverOverWomen = find(WomenLinkHover);
		hoverOver(HoverOverWomen);
		log.info("Hovering Over Women Tab in Homepage");
	}
	
	public String topstitle() {
		
		return find(getWomenTitle).getText();
	}
	
	public void TshirtLink(){
		
		find(tshirtLinkTitle).getText();
		
	}
	
	
	

}
