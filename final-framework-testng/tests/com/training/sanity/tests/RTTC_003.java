/**
 * RTTC_003
 * To verify whether application allows the user to recover password
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
import com.training.pom.RTTC_003_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


import org.testng.annotations.Test;

public class RTTC_003 {
	 
	private WebDriver driver;
	private String baseUrl;
	private RTTC_003_POM RTTC_003_POM;
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
		
		RTTC_003_POM = new RTTC_003_POM(driver);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void Login(){
		RTTC_003_POM.loginAction();
		//RTTC_002_POM.mousehover();
		RTTC_003_POM.register();
		RTTC_003_POM.email("manzoor@gmail.com");
		RTTC_003_POM.password("manzoor");
		RTTC_003_POM.submit();
		RTTC_003_POM.resetpwd();
		RTTC_003_POM.emailnew("manzoor@gmail.com");
		RTTC_003_POM.resubmit();
		
	}
}