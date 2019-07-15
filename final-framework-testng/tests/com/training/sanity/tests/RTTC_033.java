/**
 To verify whether application allows user to place an order with Pre Logging in
 */

package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.generics.ScreenShot;
import com.training.pom.RTTC_033_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


import org.testng.annotations.Test;

public class RTTC_033 {
	 
	private WebDriver driver;
	private String baseUrl;
	private RTTC_033_POM RTTC_033_POM;
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
		
		RTTC_033_POM = new RTTC_033_POM(driver);
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test(priority=0)
	public void Addkart(){
		
		RTTC_033_POM.loginAction();
		RTTC_033_POM.register();
		RTTC_033_POM.email("manzoor@gmail.com");
		RTTC_033_POM.password("manzoor");
		RTTC_033_POM.submit();
		
		RTTC_033_POM.homeclick();
		
		RTTC_033_POM.linkObj();
		RTTC_033_POM.addCart();
		RTTC_033_POM.viewCart();
		RTTC_033_POM.viewCartClick();
		RTTC_033_POM.checkOut();
		RTTC_033_POM.billingDetail();
		RTTC_033_POM.deliveryDetail();
		RTTC_033_POM.addComment("This product is nice");
		RTTC_033_POM.shippingMethod();
		RTTC_033_POM.finalchk();
		RTTC_033_POM.finalbutton();
		RTTC_033_POM.orderplace();
		
	}
	
}