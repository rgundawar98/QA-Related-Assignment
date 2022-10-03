package RadioButtonORTextBox;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheck 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		boolean val = driver.findElement(By.xpath("//label[text()='Female']")).isEnabled();
		System.out.println("Is Enabled Or Not :"+val);
		
		boolean val1 = driver.findElement(By.xpath("//label[text()='Male']")).isDisplayed();
		System.out.println("Is Displayed or Not :"+val1);
		
		boolean val2 = driver.findElement(By.xpath("//label[text()='Custom']")).isEnabled();
		System.out.println("Is Enabled or Not :"+val2);
		
		driver.close();		

	}

}
