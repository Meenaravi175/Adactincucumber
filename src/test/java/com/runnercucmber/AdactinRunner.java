package com.runnercucmber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;




@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//featurecucmber",glue = "com.adactin.stepdefinition",
monochrome=true,
dryRun=false,
strict=true,
tags=("@login,@searh_hotel,@select_hotel,@book_page,@logout"),
plugin= {"html:Report/Html_Report",
		"pretty",
		"json:Report/Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Extent_Report.html"
}
	)
public class AdactinRunner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void launch_Browser() {
		WebDriverManager.chromedriver().setup();		
	    driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public static void tearDown() {
    driver.close();
	}






}
	
	
	
	