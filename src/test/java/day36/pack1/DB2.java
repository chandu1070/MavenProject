package day36.pack1;

import org.testng.annotations.Test;

public class DB2 {

	@Test(priority=3)
	void select()
	{
		System.out.println("To delete the data");
	}
	
	@Test(priority=4)
	void delete()
	{
		System.out.println("To select the data");
	}
}

