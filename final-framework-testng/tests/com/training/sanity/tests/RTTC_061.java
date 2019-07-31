/**
 * RTTC_061
 -- To verify whether registered user details stored in database

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
import com.training.pom.RTTC_061_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


import org.testng.annotations.Test;

public class RTTC_061 {
	 
	private WebDriver driver;
	private String baseUrl;
	private RTTC_061_POM RTTC_061_POM;
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
		
		RTTC_061_POM =new RTTC_061_POM(driver);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void retailLogin(){
		RTTC_061_POM.loginAction();
		RTTC_061_POM.mousehover();
		RTTC_061_POM.register();
		RTTC_061_POM.firstname("manzoor");
		RTTC_061_POM.lastname("mehadi");
		RTTC_061_POM.mail("manzoor2@gmail.com");
		RTTC_061_POM.phone("9876543210");
		RTTC_061_POM.address1("yeshwanthapur");
		RTTC_061_POM.address2("bangalore");
		RTTC_061_POM.city("bangalore");
		RTTC_061_POM.postcode("560022");
		RTTC_061_POM.country("India");
		RTTC_061_POM.state("Karnataka");
		RTTC_061_POM.password("manzoor1");
		RTTC_061_POM.confirm("manzoor1");
		RTTC_061_POM.news();
		RTTC_061_POM.agree();
		RTTC_061_POM.submit();
		
		
	}
		}
		

	

