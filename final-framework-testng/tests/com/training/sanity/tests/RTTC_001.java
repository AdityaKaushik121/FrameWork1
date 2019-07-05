/**
 * RTTC_001
 * To verify whether application allows the user to get registered 
 by entering valid credentials in required fields

*/

package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.generics.ScreenShot;
import com.training.pom.RTTC_001_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


import org.testng.annotations.Test;

public class RTTC_001 {
	 
	private WebDriver driver;
	private String baseUrl;
	private RTTC_001_POM RTTC_001_POM;
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
		// open the browser 
		driver.get(baseUrl);
		
		RTTC_001_POM =new RTTC_001_POM(driver);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void retailLogin(){
		RTTC_001_POM.loginAction();
		RTTC_001_POM.mousehover();
		RTTC_001_POM.register();
		RTTC_001_POM.firstname("manzoor");
		RTTC_001_POM.lastname("mehadi");
		RTTC_001_POM.mail("manzoor2@gmail.com");
		RTTC_001_POM.phone("9876543210");
		RTTC_001_POM.address1("yeshwanthapur");
		RTTC_001_POM.address2("bangalore");
		RTTC_001_POM.city("bangalore");
		RTTC_001_POM.postcode("560022");
		RTTC_001_POM.country("India");
		RTTC_001_POM.state("Karnataka");
		RTTC_001_POM.password("manzoor1");
		RTTC_001_POM.confirm("manzoor1");
		RTTC_001_POM.news();
		RTTC_001_POM.agree();
		RTTC_001_POM.submit();
		
		
	}
		}
		

	

