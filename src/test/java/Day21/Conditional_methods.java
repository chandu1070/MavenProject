package Day21;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Conditional_methods {
		public static void main(String[] args) {
			//System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			WebDriver d=new ChromeDriver();
			d.get("https://www.nopcommerce.com/en/register");
			d.manage().window().maximize();
			WebElement firstname=d.findElement(By.xpath("//input[@id='FirstName']"));
			System.out.println("Display the status:"+firstname.isDisplayed());
			System.out.println("Enable the status:"+firstname.isEnabled());
			
			WebElement Email=d.findElement(By.xpath("//input[@id='Email']"));
			System.out.println("Enable status:"+Email.isEnabled());
		 
		
			//Before Selection
			//System.out.println("Before selection");
			//System.out.println(male_rd.isSelected());
			//System.out.println(female_rd.isSelected());
			 
			
			
		}


	}

