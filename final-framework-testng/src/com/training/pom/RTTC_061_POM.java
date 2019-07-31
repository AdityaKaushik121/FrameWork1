package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RTTC_061_POM {
private WebDriver driver; 
	
	public RTTC_061_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@class='tb_link dropdown tb_menu_system_account_account']")
	private WebElement loginAction;
	
	
	@FindBy(xpath="//a[@href='http://retailm1.upskills.in/account/login']//span[@class='tb_text']")
	private WebElement mousehover;
	
	@FindBy(xpath="//a[@href='http://retailm1.upskills.in/account/register']")
	private WebElement register;

	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement mail;
	
	@FindBy(xpath="//input[@name='telephone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@name='address_1']")
	private WebElement address1;
	
	@FindBy(xpath="//input[@name='address_2']")
	private WebElement address2;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@name='postcode']")
	private WebElement postcode;
	
	@FindBy(xpath="//select[@name='country_id']") //Drop down list
	private WebElement country;
	
	@FindBy(xpath="//select[@name='zone_id']") //Drop down list
	private WebElement state;
	
	
	@FindBy(xpath="//input[@name='password']") 
	private WebElement password;
	
	@FindBy(xpath="//input[@name='confirm']") 
	private WebElement confirm;
	
	@FindBy(xpath="//input[@name='newsletter' and @value='0']")  //Radio button
	private WebElement news;
	
	@FindBy(xpath="//input[@name='agree' and @value='1']")  //CheckBox button
	private WebElement agree;
	
	@FindBy(xpath="//input[@type='submit']")  //Submit button
	private WebElement submit;
	
	public void loginAction() {
		
		 Actions action = new Actions(driver);
		 action.moveToElement(loginAction).build().perform();
		
		//this.loginAction.click();
	}
	
	public void mousehover() {
		
		this.mousehover.click(); 
	}
	
	
	public void register() {
	
		this.register.click(); 
	}
	
	public void firstname(String fname) {
		
		this.firstname.sendKeys(fname);
		
	}
		
	public void lastname(String lname) {
		
		this.lastname.sendKeys(lname);
	}
	public void mail(String email) {
		
		this.mail.sendKeys(email);
	}
	public void phone(String phn) {
		
		this.phone.sendKeys(phn);
		}
	public void address1(String add1) {
		
		this.address1.sendKeys(add1);
		}
	public void address2(String add2) {
		
		this.address2.sendKeys(add2);
		}
	public void city(String cit) {
		
		this.city.sendKeys(cit);
		}
	public void postcode(String pcode) {
		
		this.postcode.sendKeys(pcode);
		}
	public void country(String cont) {
		Select sel= new Select(this.country);
		sel.selectByVisibleText(cont);
		}
	public void state(String cState) {
		Select sel= new Select(this.state);
		sel.selectByVisibleText(cState);
		}
	
	public void password(String pwd) {
		
		this.password.sendKeys(pwd);
		}
	public void confirm(String cnf) {
		
		this.confirm.sendKeys(cnf);
		}
	public void news() {
		
		this.news.click();
				}
   public void agree() {
					
		this.agree.click();
				}
   public void submit() {
		
		this.submit.click();
				}

}
