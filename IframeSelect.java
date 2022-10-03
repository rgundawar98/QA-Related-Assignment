package SeleniumScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeSelect 
{
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		   		
		driver.get("https://www.linkedin.com/home/?");
		driver.findElement(By.xpath("//iframe[1]")).click();
		driver.close();
	}

}
