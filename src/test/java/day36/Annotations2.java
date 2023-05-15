package day36;

import org.testng.annotations.*;

public class Annotations2 {
    @BeforeClass
	void login()
	{
		System.out.println("login to the application");
	}
	@Test(priority=1)
	void search() 
	{
		System.out.println("search the product");
	}
	@Test(priority=2)
	void advsearch()
	{
		System.out.println("adv search product");
	}
    @AfterClass
	void logout()
	{
		System.out.println("logout from the application");
	}
}
