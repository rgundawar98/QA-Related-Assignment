package TestNGPractices;

import org.testng.annotations.Test;

public class InnvocationTestCount 
{	
	@Test(invocationCount = 3)
	public void Test1()
	{
		System.out.println("Incorrect Login");
	}

	@Test(invocationCount = 2)
	public void Test2()
	{
		System.out.println("Unlock Account");
	}
	
	@Test
	public void Test3()
	{
		System.out.println("Login");
	}
}
