package April26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {


	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		System.out.println("ID of browser window:"+driver.getWindowHandle());

		
		driver.findElement(By.xpath("//a[normalize-space()='Open New Tabbed Windows']")).click();
		driver.findElement((By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']"))).click();
		driver.getTitle();
		
		
	}

}
