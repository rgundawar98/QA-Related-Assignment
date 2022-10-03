package TestNGPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class AjaxAutoSuggestionTest 
{
	WebDriver driver;
	@BeforeTest
	public void Test()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
	}
	
   @AfterTest	
   public void close()
   {
	  driver.quit();
   }
   
   @DataProvider(name= "search-data")
   public Object[][] dataproviderTest()
   {
	   return new Object[][] {{"Selenium webdriver tutorial"} , {"auto s"}};
   }
   
   
   @org.testng.annotations.Test(dataProvider="search-data")
   public void Search_Test(String Search)
   {
	   driver.findElement(By.className("q")).clear();
	   driver.findElement(By.className("q")).sendKeys(Search);
	   int i=1;
	   int j = i+1;
	   try
	   {
		   for(i=1;i<j;i++)
		   {
			   String suggestion = driver.findElement(By.xpath("//li[@data-view-type='1']")).getText();
			   System.out.println(suggestion);
			   j++;
		   }
	   }catch(Exception e)
	   {
		   System.out.println("**Search for another word**");
		   System.out.println();
	   }
   }
   

}
