package SeleniumScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
        driver.get("http://demo.guru99.com/test/");
        WebElement datebox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
        datebox.sendKeys("09222012");
        datebox.sendKeys(Keys.TAB);
        datebox.sendKeys("0245PM");
        driver.close();  
	}

}
