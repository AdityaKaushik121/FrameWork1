/**
 To verify whether application denies user getting logged in upon entering invalid
 credentials in required field
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
import com.training.pom.RTTC_031_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


import org.testng.annotations.Test;

public class RTTC_031 {
	 
	private WebDriver driver;
	private String baseUrl;
	private RTTC_031_POM RTTC_031_POM;
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
		
		RTTC_031_POM = new RTTC_031_POM(driver);
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(priority=0)			//Passing the first data set as per the test data sheet
	public void Login1(){
		RTTC_031_POM.loginAction();
		RTTC_031_POM.register();
		RTTC_031_POM.email("manzoor@gmail.com");
		RTTC_031_POM.password("123456");
		RTTC_031_POM.submit();

	}
	
	@Test(priority=1)   	//Passing the second data set as per the test data sheet
	public void Login2(){
		
		RTTC_031_POM.email("manzoor");
		RTTC_031_POM.password("manzoor");
		RTTC_031_POM.submit();
	}
	
	@Test(priority=2)   	//Passing the third data set as per the test data sheet
	public void Login3(){
		
		RTTC_031_POM.email("manzoor");
		RTTC_031_POM.password("mehadi");
		RTTC_031_POM.submit();
	}
	
	@Test(priority=3)   	//Passing the forth data set as per the test data sheet
	public void Login4(){
		
		RTTC_031_POM.email("manz1");
		RTTC_031_POM.password("manz1");
		RTTC_031_POM.submit();
	}
}