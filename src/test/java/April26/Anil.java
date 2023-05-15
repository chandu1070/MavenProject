package April26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Anil{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.manage().deleteAllCookies();
		d.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@id='dob']")).click();

		String mon = "Aug";
		String year = "1997";
		String date = "23";

		Select dpmonth = new Select(d.findElement(By.xpath("//select[@aria-label='Select month']")));
		dpmonth.selectByVisibleText(mon);
		Select dpyear = new Select(d.findElement(By.xpath("//select[@aria-label='Select year']")));
		dpyear.selectByVisibleText(year);

		//date

		Thread.sleep(5000);
		List<WebElement> alldates = d.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for (WebElement dt :alldates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				//break;
			}




		}

	}}