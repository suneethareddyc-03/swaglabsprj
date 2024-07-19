package com.swaglabsprj.testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest1 {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        // Set the path to your chromedriver.exe
        //System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test(priority = 1)
    public void testValidLogin() {
        // Login with valid credentials
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        loginButton.click();

        // Assertion for successful login (verify product label after login)
        WebElement productLabel = driver.findElement(By.className("product_label"));
        Assert.assertTrue(productLabel.isDisplayed(), "Product label should be displayed after login");

        // Assertion for page title after login
        String expectedTitle = "Swag Labs";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title after login is incorrect");
    }

    @Test(priority = 2)
    public void testInvalidLogin() {
        // Login with invalid credentials
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameInput.sendKeys("locked_out_user");
        passwordInput.sendKeys("invalid_password");
        loginButton.click();

        // Assertion for error message (verify error message on invalid login)
        WebElement errorButton = driver.findElement(By.cssSelector("[data-test='error']"));
        Assert.assertTrue(errorButton.isDisplayed(), "Error message should be displayed for invalid login");

        // Assertion for page title after invalid login attempt
        String expectedTitle = "Swag Labs";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title after invalid login is incorrect");
    }

    @AfterClass
    public void teardown() {
        // Close the browser
        driver.quit();
    }
}
