package May_04;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.walmart.com/ ");
		driver.manage().window().maximize();
        //driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		Thread.sleep(3000);

        WebElement link=driver.findElement(By.xpath("//div[@class='sub-nav-link-container h3 flex-wrap justify-end cg-2 overflow-hidden flex-auto f6-m b']"));
		List<WebElement>links=link.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());


		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(text(),'Furniture')]")).click();
		driver.findElement(By.xpath("//h2[normalize-space()='Office Furniture']")).click();

		//Take the screenshot
		//File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\DELL\\SeleniumScreenshot\\walmart.png");
		FileUtils.copyFile(src, target);

		
	} 
	}

