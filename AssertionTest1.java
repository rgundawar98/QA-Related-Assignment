package TestNGPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest1
{
	WebDriver driver;

	SoftAssert softassert = new SoftAssert();
	SoftAssert softassert2 = new SoftAssert();
	
	@Test
	public void verifyTitle()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        System.out.println("Assertion 1 is executed");
        softassert.assertAll();
	}
	
	@Test
	public void verifyElement()
	{
		WebElement AmazonIcon = driver.findElement(By.id("nav-logo-sprites"));
		softassert2.assertEquals(true, AmazonIcon.isDisplayed());
		softassert2.assertAll();
		System.out.println("Icon is displayed");
		System.out.println("Assertion 2 is executed");
	}
}
