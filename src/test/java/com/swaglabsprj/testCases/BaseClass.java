package com.swaglabsprj.testCases;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.swaglabsprj.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	public String baseUrl = readconfig.getApplicationUrl();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String br)
	{		
		//logger = Logger.getLogger("swaglabs");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(br.equals("chrome"))
		{
			driver = new ChromeDriver();
			System.out.println("Chrome browser");
		}
		else if(br.equals("edge"))
		{
			driver = new EdgeDriver();
			System.out.println("Edge browser");
		}
		driver.get(baseUrl);
	}
	@AfterTest
	public void teardown()
	{
	driver.quit();
	}

}
