package com.swaglabsprj.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglabsprj.pageObjects.LoginPage;

public class TC_loginTest_001 extends BaseClass {
	@Test
	public void loginTest() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		Thread.sleep(3000);
		if (driver.getTitle().equals("Swag Labs")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}
}