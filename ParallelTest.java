package TestNGPractices;

import org.testng.annotations.Test;

public class ParallelTest 
{

	@Test
	public void LoginTest1()
	{
		System.out.println("This is Test Case1 || "+Thread.currentThread().getId()); 
		
	}
	
	@Test
	public void LoginTest2()
	{
		System.out.println("This is Test Case2 || "+Thread.currentThread().getId()); 
		
	}
	
	@Test
	public void LoginTest3()
	{
		System.out.println("This is Test Case3 || "+Thread.currentThread().getId()); 
		
	}
}
