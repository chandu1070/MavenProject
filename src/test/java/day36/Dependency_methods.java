package day36;


import org.junit.Assert;
import org.testng.annotations.Test;

public class Dependency_methods {
	@Test(priority=1)
	void openapp()
	{
		System.out.println("open the application");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,dependsOnMethods= {"openapp"})
	void login()
	{
		System.out.println("login to the application");
		Assert.assertTrue(true);
	}
	
	@Test(priority=3, dependsOnMethods= {"login"})
	void search()
	{
		System.out.println("search the product");
		Assert.assertTrue(false);
	}
	
	@Test(priority=4, dependsOnMethods= {"login","search"})
	void advsearch()
	{
		System.out.println("adv search the product");
		Assert.assertTrue(true);
	}
	
	@Test(priority=5,dependsOnMethods= {"login"})
	void logout()
	{
		System.out.println("log out from the application");
		Assert.assertTrue(true);
	}
	
	
	
	
	
	
	
	
	




}
