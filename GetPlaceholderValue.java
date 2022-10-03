package TextBox;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPlaceholderValue 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://magnus.jalatechnologies.com/");
		String val = driver.findElement(By.xpath("//input[@Placeholder='Password']")).getAttribute("Placeholder");
		System.out.println("Value of placeholder is :"+val);
		driver.close();
	}

}



