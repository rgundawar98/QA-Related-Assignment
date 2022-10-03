package TextBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTextFromTextBox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://magnus.jalatechnologies.com/");
		WebElement query = driver.findElement(By.xpath("//input[@id='UserName']"));
		query.sendKeys("training@jalaacademy.com");
		query.clear();
		driver.close();
		System.out.println("The action is performed");
		
	}

}
