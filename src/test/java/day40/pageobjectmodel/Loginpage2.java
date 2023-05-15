package day40.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 {
	WebDriver driver ;
	
	public Loginpage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//listing of locators
	 @FindBy(xpath="//img[@alt='company-branding']")
     WebElement img_logo;
	
    @FindBy(xpath="//input[@name='username']")
     WebElement username;
	
    @FindBy(xpath="//input[@name='password']")
    WebElement password;
    
    @FindBy(xpath=" //button[@type='submit']")
    WebElement button;
   
	//actions methods
	public boolean checklogopresence()
	{
		boolean status =img_logo.isDisplayed();
		return status;
	}
	public  void setUsername(String name)
	{
		username.sendKeys(name);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public  void clicklogin()
	{
	button.click();
	}
	
}
