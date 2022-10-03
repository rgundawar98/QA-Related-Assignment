package TestNGPractices;

import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnotationTest 
{
	@Test
	public void TestOne()
	{
       System.out.println("In test case 1");
	}
	
	@Test
	public void TestTwo()
	{
       System.out.println("In test case 2");
	}
	
	@BeforeMethod
	public void TestThree()
	{
       System.out.println("In BeforeMethod");
	}
	
	@AfterMethod
	public void TestFour()
	{
       System.out.println("In AfterMethod");
	}
	
	@BeforeClass
	public void TestFive()
	{
       System.out.println("In Beforeclass");
	}
	
	@AfterClass
	public void TestSix()
	{
       System.out.println("In AfterClass");
	}
	
	@BeforeTest
	public void TestSeven()
	{
       System.out.println("In BeforeTest");
	}
	
	@AfterTest
	public void TestEight()
	{
       System.out.println("In AfterTest");
	}
	
	@BeforeSuite
	public void TestNine()
	{
       System.out.println("In BeforeSuite");
	}
	
	@AfterSuite
	public void TestTen()
	{
       System.out.println("In AfterSuite");
	}
	
 }


