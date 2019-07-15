package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RTTC_032_POM {
private WebDriver driver; 
	
	public RTTC_032_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@href='http://retailm1.upskills.in/donec-suscipitURLURLURL']") //Click on object link
	private WebElement linkObj;
	
	@FindBy(xpath="//button[@type='button' and @id='button-cart']") //Add to cart
	private WebElement addCart;
	
	
	@FindBy(xpath="//i[@class='tb_icon ico-linea-ecommerce-bag']")  //Mouse Hover
	private WebElement viewCart;
	
	@FindBy(xpath="//a[@class='btn btn-sm']")  //Click on 'View cart'
	private WebElement viewCartClick;
	
	@FindBy(xpath="//a[@href='http://retailm1.upskills.in/checkout/checkout' and @class='btn btn-primary']")  //CheckOut 
	private WebElement checkOut;
	
	//Click on the Object where we need to select the object	
	
	public void linkObj() {
		
		this.linkObj.click();  
		
	}
	
	//Click on the Add to Cart option for the particular object
	
	public void addCart() {
		
		this.addCart.click(); 
	}
	
	//View the details of the objects that is added to cart recently and mousehover it.
	
	public void viewCart() {
		
		 Actions action = new Actions(driver);
		 action.moveToElement(viewCart).build().perform();
		
	}
	
	//Click on 'View cart'
		
	public void viewCartClick() {
		
		this.viewCartClick.click();
	}
	
	//Click on checkOut button
   
   public void checkOut() {
		
		this.checkOut.click();
				}	
   }
