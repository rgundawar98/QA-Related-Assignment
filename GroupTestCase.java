package TestNGPractices;

import org.testng.annotations.Test;

public class GroupTestCase 
{

	@Test(groups = {"SanityTest" ,"RegressionTest"})
	public void Sanity1()
	{
	 System.out.println("This is Sanity TC1"); 	
	}
	
	@Test(groups = {"SanityTest" ,"RegressionTest"})
	public void Sanity2()
	{
	 System.out.println("This is Sanity TC2"); 	
	}
	
	@Test(groups = {"SmokeTest" , "RegressionTest"})
	public void Smoke1()
	{
	 System.out.println("This is Smoke TC1"); 	
	}
	@Test(groups = {"SmokeTest"})
	public void Smoke2()
	{
	 System.out.println("This is Smoke TC2"); 	
	}
	
	@Test(groups = {"RegressionTest"})
	public void Regression()
	{
	 System.out.println("This is Regression TC"); 	
	}
}
