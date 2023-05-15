package day36.pack1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DB_connection {

	@BeforeTest
	void openconnection()
	{
		System.out.println("DB Connection opened");
	}
	@AfterTest
	void closedconnection()
	{
		System.out.println("DB Connection closed");
	}

}
