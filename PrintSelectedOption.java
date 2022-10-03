package DropDownORListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintSelectedOption 
{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/reg/");
    driver.findElement(By.id("year")).click();
    String val = driver.findElement(By.xpath("//option[32]")).getText();
    System.out.println("Value For This Selected Element is :"+val);
	driver.close();
	}
}








