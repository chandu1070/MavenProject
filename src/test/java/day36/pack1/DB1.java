package day36.pack1;

import org.testng.annotations.Test;

public class DB1 {

	@Test(priority=1)
	void insert()
	{
		System.out.println("To insert the data");
	}
	
	@Test(priority=2)
	void update()
	{
		System.out.println("To update the data");
	}
}
