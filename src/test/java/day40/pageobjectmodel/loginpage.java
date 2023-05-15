package day40.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {

	WebDriver driver ;
	loginpage (	WebDriver driver )
	{
		this.driver=driver;
	}
	
	//listing of locators
	By img_loc =By.xpath("//img[@alt='company-branding']");
	By txt_username =By.name("Username");
	By txt_password =By.name("Password");
	By txt_login =By.xpath("//button[@type='submit']");
	
	
	//actions methods
	public boolean checklogopresence()
	{
		boolean status =driver.findElement(img_loc).isDisplayed();
		return status;
	}
	public  void setusername(String name)
	{
		driver.findElement(txt_username).sendKeys(name);
	}
	public  void setpassword(String pwd)
	{
		driver.findElement(txt_password).sendKeys(pwd);
	}
	
	public  void clicklogin()
	{
		driver.findElement(txt_login).click();
	}

	}

