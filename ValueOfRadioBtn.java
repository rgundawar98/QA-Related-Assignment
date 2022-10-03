package RadioButtonORTextBox;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValueOfRadioBtn 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://en-gb.facebook.com/reg/");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//label[text()='Custom']")).click();
		driver.close();

	}

}
