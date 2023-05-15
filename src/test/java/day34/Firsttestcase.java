package day34;

import org.testng.annotations.Test;

public class Firsttestcase {
	@Test(priority=1)
	void openapp()
	{
		System.out.println("opening application....");
	}
	
	@Test(priority=2)
	void login() 
	{
	System.out.println("Login to application....");	
	}
	
	@Test(priority=3)
	void logout()
	{
		System.out.println("logout from the application");
	}
	
	@Test(priority=4)
	void closeapp()
	{
		System.out.println("close the application");
	}

}
