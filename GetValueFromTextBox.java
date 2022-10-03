package TextBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetValueFromTextBox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://magnus.jalatechnologies.com/");
		
		WebElement a = driver.findElement(By.xpath("//input[@id='UserName']"));
		a.sendKeys("training@jalaacademy.com");
		String val = a.getAttribute("value");
		System.out.println("Entered text is : "+val);
		driver.close();
	}

}
