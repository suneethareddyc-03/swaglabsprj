package com.swaglabsprj.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
    WebDriver driver;

    // Constructor
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // FindBy annotation with XPath
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartButton;
    
    @FindBy(id = "item_4_title_link")
    WebElement saucelabsbackpack;
    
    @FindBy(className="shopping_cart_badge")
    WebElement shoppingcartbadge;
    
    @FindBy(id = "checkout")
    WebElement checkout;
    
    @FindBy(id = "first-name")
    WebElement firstname;
    
    @FindBy(id = "last-name")
    WebElement lastname;
    
    @FindBy(id = "postal-code")
    WebElement postalcode;
    
    @FindBy(id = "continue")
    WebElement continuebtn;
    
    @FindBy(id = "finish")
    WebElement finish;
    
    @FindBy(id = "back-to-products")
    WebElement backtoproducts;
    
    // Method to perform actions on the element
    public void clickAddToCartButton() {
        addToCartButton.click();
    }
    
    public void clicksaucelabsbackpack() {
    	saucelabsbackpack.click();
    }
    
    public void clickshoppingcartbadge() {
    	shoppingcartbadge.click();
    }
    
    public void clickcheckout() {
    	checkout.click();
    }
    
    public void setfirstname(String f) {
    	firstname.sendKeys(f);
    }
    
    public void setlastname(String l) {
    	lastname.sendKeys(l);
    }
    
    public void setpostalcode(String p) {
    	postalcode.sendKeys(p);
    }
    
    public void clickcontinue() {
    	continuebtn.click();
    }
    
    public void clickfinish() {
    	finish.click();
    }
    
    public void clickbacktoproducts() {
    	backtoproducts.click();
    }
}
