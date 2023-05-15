package day25;


		import java.util.Scanner;

		import java.util.Set;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class MuLTI {
			System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
			WebDriver d=new ChromeDriver();
				
				d.get("https://www.dezlearn.com/multiple-browser-windows/");
				d.manage().window().maximize();
				Thread.sleep(2000);
				d.findElement(By.id("u_7_8")).click();
				Thread.sleep(3000);
			}
			public void navigate()
			{
				d.get(s);
				d.manage().window().maximize();
				String parent_id=d.getWindowHandle();
				System.out.println(parent_id);
				d.findElement(By.id("u_7_8")).click();
				Set<String> child=d.getWindowHandles();
				System.out.println(child);
				for(String s:child)
				{	
					d.switchTo().window(s);
					System.out.println(d.getTitle());
					
				}
				String[] handles = child.toArray(new String[child.size()]);
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter page name");
				String page=sc.next();
				System.out.println("you entered "+page);		
				if(page.equals("Facebook"))
				{
				d.switchTo().window(handles[6]);
				d.findelement(by.id("email")).sendkeys("sekhardantla@gmail.com");
				d.findElement(By.id("pass")).sendKeys("Sekhar");
				}
				else if(page.equals("YouTube"))
				{
					d.switchTo().window(handles[5]);
					d.findElement(By.xpath("//input[@id='search']")).sendKeys("RRR");
				}
				else if(page.equals("LinkedIn"))
				{
					d.switchTo().window(handles[4]);
					d.findelement(by.id("session_key")).sendkeys("sekhardantla@gmail.com");
					d.findElement(By.id("session_password")).sendKeys("Sekhar");
				}
				else if(page.equals("Twitter"))
				{
					d.switchTo().window(handles[3]);
					d.findElement(By.xpath("//input")).sendKeys("RRR");
				}
				else if(page.equals("Apple"))
				{
					d.switchTo().window(handles[2]);
				}
				else if(page.equals("Google"))
				{
					d.switchTo().window(handles[1]);
					d.findElement(By.name("q")).sendKeys("Sekhar Reddy Dantla ");
				}
				else if(page.equals("Dezlearn"))
				{
					d.switchTo().window(handles[0]);
				}
			}
			public static void main(String args[])
			{
				multiple_windows m= new multiple_windows();
				m.open_brower();
				m.navigate();
				
				
				
			}
			

		}

	}

}
