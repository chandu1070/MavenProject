package day37;

import org.testng.annotations.*;

/*
 Login by Email        -Sanity&regression
 Login by facebook     -Sanity
 login by twitter      -Sanity
 
 
 Signup by emailn      -sanity @regression
 sign up by facebook    -Regression
 signup by twitter      -Regression
 
 Payement in rupeees     -sanity @regression
 Payment in dollars      - sanity
 amount return by bank   -regression       */
	public class GroupingDemo {
		@Test(priority=1,groups={"sanity","regression"})
		void Emaillogin()
		{
			System.out.println("login by Email");
		}
		
		@Test(priority=2,groups={"sanity"})
		void facebooklogin()
		{
			System.out.println("login by Facebook");
		}
		@Test(priority=3,groups={"sanity"})
		void twitterlogin()
		{
			System.out.println("Login by twitter");
		}
		@Test(priority=4,groups={"sanity","regression"})
		void emailsignup() {
			System.out.println("signup by email");
			
		}
		@Test(priority=5,groups={"regression"})
		void facebooksignup() {
			System.out.println("signup by facenbook");
		}
		
		@Test(priority=6,groups={"regression"})
		void twitersignup() {
			System.out.println("signup by twitter");
		}
	   @Test (priority=7,groups= {"sanity","regression"})
	   void paymentinR() {
		   System.out.println("payment in rupees");
		   
	   }
	   @Test(priority=8,groups= {"sanity"})
	   void paymentinD() {
		   System.out.println("payment in dollars");
	   }
	   @Test(priority=9,groups="regression")
	   void returnbyBank() {
		   System.out.println("amount return by bank");
	   }
	
	
	
	

}
