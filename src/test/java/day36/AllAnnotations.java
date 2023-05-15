package day36;

import org.testng.annotations.*;
public class AllAnnotations {
	@BeforeSuite
	void bs()
	{
		System.out.println("before suite");
	}
	@AfterSuite
	void as()
	{
		System.out.println("Afer suite");
	}
	@BeforeTest
	void beforetest()
	{
		System.out.println("before test");
	}
	
	@AfterTest
	void aftertest()
	{
		System.out.println("aftertest");
		
	}
	@BeforeClass
     void bc()
	{
		System.out.println("beforeclass");
	}
	
	@AfterClass
	void AC()
	{
		System.out.println("After class");
	}
	@BeforeMethod
	void BM()
	 {
		System.out.println("Before Method");	
	 }
	
	@AfterMethod
	void AM()
	{
		System.out.println("After method");
	}
   @Test
   void beforemethod()
   {
	   System.out.println("vamsi");
   }
   
   @Test
   void aftermethod()
   {
	   System.out.println("koppula");
	   
   }
}
