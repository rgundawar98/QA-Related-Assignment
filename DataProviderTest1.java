package TestNGPractices;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest1 
{

	@Test(dataProvider="login")
	void LoginTest(String user ,String password)
	{
		System.out.println("Start Testing");
	 	System.out.println(user+ " ------- "+password);
	 	System.out.println("End Testing");
	}
	
	@DataProvider(name="login")
	public static Object [][] getData()
	{
		return new Object[][]
				{
			      {"Pankaj1" , "Pass1"},
			      {"Pankaj2" , "Pass2"},
			      {"Pankaj3" , "Pass3"},
			      {"Pankaj4" , "Pass4"},
			      {"Pankaj5" , "Pass5"}
				};
	}
}
