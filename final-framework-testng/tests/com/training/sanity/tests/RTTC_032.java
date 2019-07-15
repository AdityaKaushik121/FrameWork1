/**
 To verify whether application displays Login screen upon checking out the 
 product without Pre Logging in
 */

package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.generics.ScreenShot;
import com.training.pom.RTTC_032_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


import org.testng.annotations.Test;

public class RTTC_032 {
	 
	private WebDriver driver;
	private String baseUrl;
	private RTTC_032_POM RTTC_032_POM;
	private static Properties properties;
	private ScreenShot screenShot;
	
		
	@BeforeClass
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);
		
		RTTC_032_POM = new RTTC_032_POM(driver);
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(priority=0)
	public void Addkart(){
		
		RTTC_032_POM.linkObj();  	//Step#2---> Test case and the Object on web page does not match so selecting random value.
		RTTC_032_POM.addCart(); 	//Step#3	
		RTTC_032_POM.viewCart();	//Step#4
		RTTC_032_POM.viewCartClick();	//Step#5
		RTTC_032_POM.checkOut();		//Step#6
		
		
	}
	
}