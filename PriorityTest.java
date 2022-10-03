package TestNGPractices;

import org.testng.annotations.Test;

public class PriorityTest 
{
	@Test(priority = 2)
	public void Test1()
	{
		System.out.println("This is TC1");
		
	}
	
	@Test(priority = 3)
	public void Test2()
	{
		System.out.println("This is TC2");
		
	}
	
	@Test(priority = 4)
	public void Test3()
	{
		System.out.println("This is TC3");
		
	}
	
	
	@Test(priority = 1)
	public void Test4()
	{
		System.out.println("This is TC4");
		
	}
	
	
	@Test
	public void Test5()
	{
		System.out.println("This is TC5");
		
	}

}
