package day36.pack1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class testsuite {

	@BeforeSuite
	void openconnection()
	{
		System.out.println("DB Connection opened");
	}
	@AfterSuite
	void closedconnection()
	{
		System.out.println("DB Connection closed");
	}

}
