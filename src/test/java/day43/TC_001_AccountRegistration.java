package day43;



		import org.testng.Assert;
		import org.testng.annotations.Test;

		import pageObjects.AccountRegistrationPage;
		import pageObjects.HomePage;
		import testBase.BaseClass;

		public class TC_001_AccountRegistration extends BaseClass
		{	
			@Test
			public void test_account_registration()
			{
				driver.get("http://localhost/opencart/upload/");
				driver.manage().window().maximize();
				
				HomePage hp=new HomePage(driver);
				hp.clickmyaccount();
				hp.clickRegister();
				
				AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
				
				regpage.setFirstName("John");
				regpage.setLastName("Canedy");
				regpage.setEmail(randomestring()+"@gmail.com");
				regpage.setTelephone("65656565");
				regpage.setPassword("abcxyz");
				regpage.setConfirmPassword("abcxyz");
				regpage.setPrivacyPolicy();
				
				regpage.clickContinue();
				
				String confmsg=regpage.getConfirmationMsg();
				
				if(confmsg.equals("Your Account Has Been Created!"))
				{
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}}
		}
