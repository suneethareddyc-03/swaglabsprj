package com.swaglabsprj.testCases;

import org.testng.annotations.Test;

import com.swaglabsprj.pageObjects.InventoryPage;

public class TC_addCart_002 extends BaseClass {
	@Test(dependsOnMethods = {"loginTest"})
	public void addCart() throws InterruptedException
	{
		InventoryPage ip = new InventoryPage(driver);
		ip.clickAddToCartButton();
		System.out.println("Add cart is clicked");
		Thread.sleep(2000);
		ip.clicksaucelabsbackpack();
		System.out.println("Sauce Lab Back Pack is clicked");
		Thread.sleep(2000);
		ip.clickshoppingcartbadge();
		System.out.println("Shopping cart is clicked");
		Thread.sleep(2000);
		ip.clickcheckout();
		System.out.println("Check out is clicked");
		Thread.sleep(2000);
		ip.setfirstname("Hari");
		ip.setlastname("Ram");
		ip.setpostalcode("450089");
		Thread.sleep(2000);
		ip.clickcontinue();
		ip.clickfinish();
		ip.clickbacktoproducts();
		
		System.out.println("Shopping is completed, Thank you");
		Thread.sleep(2000);
		 
	}

}
