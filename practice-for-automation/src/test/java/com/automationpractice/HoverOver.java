package com.automationpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.base.BaseTest;
import com.automationpractice.base.HomePageObject;
import com.automationpractice.base.HoverOverObject;

public class HoverOver extends BaseTest{
	
	@Test
	public void womenHoverOver() {
		
		// open url
				HomePageObject homepage = new HomePageObject(driver, log);
				homepage.OpenPage();
				
				
		HoverOverObject women = new HoverOverObject(driver,log);
		
		//hover over women title
		women.womenHover();
		
		//get the title and compare the text
		String actualTitle = women.topstitle();
		String expectedTitle = "TOPS";
		Assert.assertEquals(actualTitle, expectedTitle,"Strings are not equal");
		
	}

	
	
	
	
}
