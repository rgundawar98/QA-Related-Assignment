package DropDownORListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintFirstOption 
{
	public static void main(String[] args) 
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   ChromeDriver driver = new ChromeDriver();
		
	   driver.get("https://en-gb.facebook.com/reg/");
	   driver.findElement(By.id("day")).click();
	   String b =driver.findElement(By.xpath("//option[1]")).getText();
	   System.out.println("Value :"+b);
	   driver.close();

	}

}
