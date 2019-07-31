/**
 * RTTC_063
 -- To verify whether application denies the user to get registered on the application by entering invalid credentials

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
import com.training.pom.RTTC_063_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


import org.testng.annotations.Test;

public class RTTC_063 {
	 
	private WebDriver driver;
	private String baseUrl;
	private RTTC_063_POM RTTC_063_POM;
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
		
		RTTC_063_POM =new RTTC_063_POM(driver);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	
	@Test(priority=0)
	public void retailLogin(){
		RTTC_063_POM.loginAction();
		RTTC_063_POM.mousehover();
		RTTC_063_POM.register();
		RTTC_063_POM.firstname("1233423");
		RTTC_063_POM.lastname("manipal");
		RTTC_063_POM.mail("manipal9876@gmail.com");
		RTTC_063_POM.phone("9876543210");
		RTTC_063_POM.address1("yeshwanthapur");
		RTTC_063_POM.address2("bangalore");
		RTTC_063_POM.city("bangalore");
		RTTC_063_POM.postcode("560022");
		RTTC_063_POM.country("India");
		RTTC_063_POM.state("Karnataka");
		RTTC_063_POM.password("manipal");
		RTTC_063_POM.confirm("manipal");
		RTTC_063_POM.news();
		RTTC_063_POM.agree();
		RTTC_063_POM.submit();
		RTTC_063_POM.loginAction();
		RTTC_063_POM.logout();
		
		
	}
	@Test(priority=1)
	public void retailLogin2(){
		RTTC_063_POM.loginAction();
		RTTC_063_POM.mousehover();
		RTTC_063_POM.register();
		RTTC_063_POM.firstname("manzoor");
		RTTC_063_POM.lastname("mehadi");
		RTTC_063_POM.mail("manzoor77");
		RTTC_063_POM.phone("9876543210");
		RTTC_063_POM.address1("electronic city");
		RTTC_063_POM.address2("bangalore");
		RTTC_063_POM.city("bangalore");
		RTTC_063_POM.postcode("560100");
		RTTC_063_POM.country("India");
		RTTC_063_POM.state("Karnataka");
		RTTC_063_POM.password("manzoor");
		RTTC_063_POM.confirm("manzoor");
		RTTC_063_POM.news();
		RTTC_063_POM.agree();
		RTTC_063_POM.submit();
		RTTC_063_POM.loginAction();
		RTTC_063_POM.logout();
		
	}
	@Test(priority=2)
	public void retailLogin3(){
		RTTC_063_POM.loginAction();
		RTTC_063_POM.mousehover();
		RTTC_063_POM.register();
		RTTC_063_POM.firstname("puli");
		RTTC_063_POM.lastname("keshi");
		RTTC_063_POM.mail("puli1b125@gmail.com");
		RTTC_063_POM.phone("sfgdfgdf");
		RTTC_063_POM.address1("chennai");
		RTTC_063_POM.address2("chennai");
		RTTC_063_POM.city("chennai");
		RTTC_063_POM.postcode("561321");
		RTTC_063_POM.country("India");
		RTTC_063_POM.state("Tamil Nadu");
		RTTC_063_POM.password("pulikeshi");
		RTTC_063_POM.confirm("pulikeshi");
		RTTC_063_POM.news();
		RTTC_063_POM.agree();
		RTTC_063_POM.submit();
		RTTC_063_POM.loginAction();
		RTTC_063_POM.logout();
		
	}
	@Test(priority=3)
	public void retailLogin4(){
		RTTC_063_POM.loginAction();
		RTTC_063_POM.mousehover();
		RTTC_063_POM.register();
		RTTC_063_POM.firstname("priya");
		RTTC_063_POM.lastname("prabhu");
		RTTC_063_POM.mail("priya1b131@gmail.com");
		RTTC_063_POM.phone("8906754321");
		RTTC_063_POM.address1("hyderabad");
		RTTC_063_POM.address2("hyderabad");
		RTTC_063_POM.city("hyderabad");
		RTTC_063_POM.postcode("9876547");
		RTTC_063_POM.country("India");
		RTTC_063_POM.state("Telangana");
		RTTC_063_POM.password("priya");
		RTTC_063_POM.confirm("priya");
		RTTC_063_POM.news();
		RTTC_063_POM.agree();
		RTTC_063_POM.submit();
		RTTC_063_POM.loginAction();
		RTTC_063_POM.logout();
		
	}}
		

	

