package DropDownORListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllOption 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
	    String val = driver.findElement(By.id("month")).getText();
	    System.out.println("Value of First Selected Element is  :"+val);
		
		
		driver.close();		
		

	}

}
