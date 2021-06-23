package com.automationpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.base.BaseTest;
import com.automationpractice.base.HomePageObject;

public class Homepage extends BaseTest {

	@Test
	private void homepageview() {

		
		// open url
		HomePageObject homepage = new HomePageObject(driver, log);
		homepage.OpenPage();

		// women link
		homepage.clickWomen();

		// compare message displayed
		String actualResult = homepage.WomenMsgText();
		String expectedResult = "You will find here all woman fashion collections.";

		
		Assert.assertEquals(actualResult, expectedResult);

		// Dresses link
				homepage.clickDresses();

				// compare message displayed
				String actualResult1 = homepage.DressesMsgText();
				String expectedResult1 = "Find your favorites dresses from our wide choice of evening, casual or summer dresses!";

				
				Assert.assertEquals(actualResult1, expectedResult1);
				
				// T-Shirt link
				homepage.clickTshirts();

				// compare message displayed
				String actualResult2 = homepage.TshirtMsgText();
				String expectedResult2 = "The must have of your wardrobe, take a look at our different colors,";

				
				Assert.assertEquals(actualResult2, expectedResult2);
		
	}
	
	

}
