/**
 * RTTC_062
 -- To verify whether application allows multiple user to get registered into the application

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
import com.training.pom.RTTC_062_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


import org.testng.annotations.Test;

public class RTTC_062 {
	 
	private WebDriver driver;
	private String baseUrl;
	private RTTC_062_POM RTTC_062_POM;
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
		
		RTTC_062_POM =new RTTC_062_POM(driver);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	
	@Test(priority=0)
	public void retailLogin(){
		RTTC_062_POM.loginAction();
		RTTC_062_POM.mousehover();
		RTTC_062_POM.register();
		RTTC_062_POM.firstname("sunil");
		RTTC_062_POM.lastname("nagaraj");
		RTTC_062_POM.mail("sunil1b11@gmail.com");
		RTTC_062_POM.phone("987654321000");
		RTTC_062_POM.address1("yeshwanthapur");
		RTTC_062_POM.address2("bangalore");
		RTTC_062_POM.city("bangalore");
		RTTC_062_POM.postcode("560022");
		RTTC_062_POM.country("India");
		RTTC_062_POM.state("Karnataka");
		RTTC_062_POM.password("manipal");
		RTTC_062_POM.confirm("manipal");
		RTTC_062_POM.news();
		RTTC_062_POM.agree();
		RTTC_062_POM.submit();
		RTTC_062_POM.loginAction();
		RTTC_062_POM.logout();
		
		
	}
	@Test(priority=1)
	public void retailLogin2(){
		RTTC_062_POM.loginAction();
		RTTC_062_POM.mousehover();
		RTTC_062_POM.register();
		RTTC_062_POM.firstname("manzoor");
		RTTC_062_POM.lastname("mehadi");
		RTTC_062_POM.mail("mehadi1b12@gmail.com");
		RTTC_062_POM.phone("9876543210");
		RTTC_062_POM.address1("electronic city");
		RTTC_062_POM.address2("bangalore");
		RTTC_062_POM.city("bangalore");
		RTTC_062_POM.postcode("560100");
		RTTC_062_POM.country("India");
		RTTC_062_POM.state("Karnataka");
		RTTC_062_POM.password("manzoor");
		RTTC_062_POM.confirm("manzoor");
		RTTC_062_POM.news();
		RTTC_062_POM.agree();
		RTTC_062_POM.submit();
		RTTC_062_POM.loginAction();
		RTTC_062_POM.logout();
		
	}
	@Test(priority=2)
	public void retailLogin3(){
		RTTC_062_POM.loginAction();
		RTTC_062_POM.mousehover();
		RTTC_062_POM.register();
		RTTC_062_POM.firstname("puli");
		RTTC_062_POM.lastname("keshi");
		RTTC_062_POM.mail("puli1b12@gmail.com");
		RTTC_062_POM.phone("6789043217");
		RTTC_062_POM.address1("chennai");
		RTTC_062_POM.address2("chennai");
		RTTC_062_POM.city("chennai");
		RTTC_062_POM.postcode("561321");
		RTTC_062_POM.country("India");
		RTTC_062_POM.state("Tamil Nadu");
		RTTC_062_POM.password("pulikeshi");
		RTTC_062_POM.confirm("pulikeshi");
		RTTC_062_POM.news();
		RTTC_062_POM.agree();
		RTTC_062_POM.submit();
		RTTC_062_POM.loginAction();
		RTTC_062_POM.logout();
		
	}
	@Test(priority=3)
	public void retailLogin4(){
		RTTC_062_POM.loginAction();
		RTTC_062_POM.mousehover();
		RTTC_062_POM.register();
		RTTC_062_POM.firstname("priya");
		RTTC_062_POM.lastname("prabhu");
		RTTC_062_POM.mail("priya1b12@gmail.com");
		RTTC_062_POM.phone("8906754321");
		RTTC_062_POM.address1("hyderabad");
		RTTC_062_POM.address2("hyderabad");
		RTTC_062_POM.city("hyderabad");
		RTTC_062_POM.postcode("620102");
		RTTC_062_POM.country("India");
		RTTC_062_POM.state("Telangana");
		RTTC_062_POM.password("priya");
		RTTC_062_POM.confirm("priya");
		RTTC_062_POM.news();
		RTTC_062_POM.agree();
		RTTC_062_POM.submit();
		RTTC_062_POM.loginAction();
		RTTC_062_POM.logout();
		
	}}
		

	

