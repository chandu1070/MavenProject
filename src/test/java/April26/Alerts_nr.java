package April26;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Alerts_nr {

	public static void main(String[] args) throws InterruptedException {
		 {

				WebDriverManager.chromedriver().setup();
				WebDriver d=new ChromeDriver();
				//System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
				d.get("https://demo.automationtesting.in/Alerts.html");
				d.manage().window().maximize();
				d.manage().deleteAllCookies();
				Thread.sleep(2000);

				/*d.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"));

				d.findElement(By.xpath("//*[@class='dropdown-toggle']")).click();
				d.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();

				Alert alt=d.switchTo().alert();
				System.out.println("Alert open");*/

				d.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
				Alert alt=d.switchTo().alert();
				System.out.println(alt.getText());
				alt.accept();

				/*String actualtext=d.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).getText();
				String expectedText="i am an alert box";
				//Assert.assertEquals(actualtext, expectedText);
                //Assert.assertEquals(actualtext, expectedText);
                Assert.assertEquals(true, true); */
                
				d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
				d.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
				Alert alt1=d.switchTo().alert();
				System.out.println(alt1.getText());
				alt.accept();

				d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
				d.findElement(By.xpath("//*[@class='btn btn-info']")).click();
				Alert alt2=d.switchTo().alert();
				System.out.println(alt2.getText());
				alt2.sendKeys("vamsi tutorials");
				alt2.accept();
	

				WebElement text=d.findElement(By.id("demo1"));
				System.out.println(text.getText());
				
				WebElement text1=d.findElement(By.id("demo"));
				System.out.println(text1.getText());
				String Actualvalue =text1.getText();
				String Expectedvalue= "You pressed Ok";
						

				if(Actualvalue.equals(Expectedvalue))
				{
					System.out.println("You pressed ok with no issue");
					
				}
				else {
					System.out.println("you pressed cancel");
				}
					}

				}
					}


