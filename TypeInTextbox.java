package TextBox;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeInTextbox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://magnus.jalatechnologies.com/");
		
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("training@jalaacademy.com");
		driver.close();

	}

}
