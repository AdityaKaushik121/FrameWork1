package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RTTC_002_POM {
private WebDriver driver; 
	
	public RTTC_002_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@class='tb_link dropdown tb_menu_system_account_account']")
	private WebElement loginAction;
	
	
	/*@FindBy(xpath="//a[@href='http://retailm1.upskills.in/account/login']//span[@class='tb_text']")
	private WebElement mousehover;*/
	
	@FindBy(xpath="//a[@href='http://retailm1.upskills.in/account/login']//span[@class='tb_text']")
	private WebElement register;

	@FindBy(xpath="//input[@id='input-email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement password;
	
	
	@FindBy(xpath="//input[@class='btn btn-primary']")  //Submit button
	private WebElement submit;
	
	
	
	
	
	
	
	public void loginAction() {
		
		 Actions action = new Actions(driver);
		 action.moveToElement(loginAction).build().perform();
		
		//this.loginAction.click();
	}
	
	public void register() {
		
		this.register.click(); 
	}
	
	
	
	public void email(String email) {
		
		this.email.sendKeys(email);
		
	}
		
	public void password(String pwd) {
		
		this.password.sendKeys(pwd);
	}
	
   
   public void submit() {
		
		this.submit.click();
				}

}
