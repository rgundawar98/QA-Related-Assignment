package RadioButtonORTextBox;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioSelectedorNot 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		boolean val = driver.findElement(By.xpath("//input[@value=2]]")).isSelected();
		
		System.out.println("Is Selected Or Not :"+val);
		
		driver.close();

	}

}
