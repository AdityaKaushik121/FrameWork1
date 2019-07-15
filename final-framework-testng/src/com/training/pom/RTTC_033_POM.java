package com.training.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RTTC_033_POM {
private WebDriver driver; 
	
	public RTTC_033_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//li[@class='tb_link dropdown tb_menu_system_account_account']")
	private WebElement loginAction;   //Element for login button
	
	@FindBy(xpath="//a[@href='http://retailm1.upskills.in/account/login']//span[@class='tb_text']")
	private WebElement register;  ////Element for login details

	@FindBy(xpath="//input[@id='input-email']")
	private WebElement email; 	//Element for the email/User name field
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement password;   //Element for Password field
	
	
	@FindBy(xpath="//input[@class='btn btn-primary']")  //Submit button
	private WebElement submit;
	
	@FindBy(xpath="//a[@href= 'http://retailm1.upskills.in/']//span")
	private WebElement homeclick;
	
	@FindBy(xpath="//a[@href='http://retailm1.upskills.in/donec-suscipitURLURLURL']") //Click on object link
	private WebElement linkObj;
	
	@FindBy(xpath="//button[@type='button' and @id='button-cart']") //Add to cart
	private WebElement addCart;
	
	
	@FindBy(xpath="//i[@class='tb_icon ico-linea-ecommerce-bag']")  //Mouse Hover
	private WebElement viewCart;
	
	@FindBy(xpath="//a[@class='btn btn-sm']")  //Click on 'View cart'
	private WebElement viewCartClick;
	
	@FindBy(xpath="//a[@href='http://retailm1.upskills.in/checkout/checkout' and @class='btn btn-primary']")  //CheckOut 
	private WebElement checkOut; 	//Element for the Check out button
	
	@FindBy(xpath="//input[@id='button-payment-address' and @class='btn btn-primary']")
	private WebElement billingDetail;
	
	@FindBy(xpath="//input[@id='button-shipping-address']")
	private WebElement deliveryDetail;
	
	@FindBy(xpath="//textarea[@name='comment' and @class='form-control']")
	private WebElement addComment;
	
	@FindBy(xpath="//input[@id='button-shipping-method']")
	private WebElement shippingMethod;
	
	@FindBy(xpath="//input[@name='agree' and @value ='1']")
	private WebElement finalchk;
	
	@FindBy(xpath="//input[@value='Continue' and @id='button-payment-method']")
	private WebElement finalbutton;
	
	@FindBy(xpath="//input[@value='Confirm Order' and @id='button-confirm']")
	private WebElement orderplace;
		
	public void loginAction() {
		
		 Actions action = new Actions(driver);
		 action.moveToElement(loginAction).build().perform();
		
		//this.loginAction.click();
	}
	
	public void register() {
		
		this.register.click(); 
	}
	
	
	//email method will pass the value of email id in appropriate text field
	public void email(String email) {
		this.email.clear();
		this.email.sendKeys(email);
		
	}
	
	//password method will pass the value of password in appropriate password field
		
	public void password(String pwd) {
		this.password.clear();
		this.password.sendKeys(pwd);
	}
	
   //click on the submit button to login 
	
   public void submit() {
		
		this.submit.click();
				}	
	//Clicking on home button
   
   public void homeclick(){
	   
	   this.homeclick.click();	   
   }
				
	public void linkObj() {
		
		this.linkObj.click();
		
	}
	
	public void addCart() {
		
		this.addCart.click(); 
	}
	
	
	
	public void viewCart() {
		
		 Actions action = new Actions(driver);
		 action.moveToElement(viewCart).build().perform();
		
	}
		
	public void viewCartClick() {
		
		this.viewCartClick.click();
	}
	
   
   public void checkOut() {
		
		this.checkOut.click();
		
				}	
   public void billingDetail() {
	  // Thread.sleep(2000);
	   this.billingDetail.click();
   }
   
   public void deliveryDetail() {
	  // Thread.sleep(5000);
	   this.deliveryDetail.click();
   }
   
   public void addComment(String comment){
	   this.addComment.sendKeys(comment);
   }
   
   public void shippingMethod(){
	   this.shippingMethod.click();
   }
   
   public void finalchk(){
	   JavascriptExecutor js = (JavascriptExecutor) driver;  
	   js.executeScript("window.scrollBy(0,300)");
	   this.finalchk.click();
   }
   public void finalbutton(){
	   this.finalbutton.click();
   }
   public void orderplace(){
	   this.orderplace.click();
	   
	   
   }
   
   }
