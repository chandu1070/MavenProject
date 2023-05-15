package step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Step_definitions {

	WebDriver driver;
	
@Given("I launch chrome browser")
public void launch_browser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
}

@And("I open orange hrm homepage")
public void open_homepage() {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@When("enter username and password")
public void enter_credientials() {
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	
}

@And("Click on login button")
public void login_button() {
	driver.findElement(By.xpath("//button[@type='submit']"));	
}


@Then("user must successfully login to the Dashboard page")
public void Check_the_dashboard_page() {
	String text=null;
	try
	{
		driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();	
	}
	catch(Exception e)
	{
		driver.close();
		Assert.assertTrue(false);
	}
	
		if(text=="DashBoard")
		{
			Assert.assertFalse(true);
			
		}
}


@And("Close the browser")
public void closebrowser() {
	driver.quit();
}


}
