package AutomateLogIn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LogInUsingChromeDriver 
{
	
		public void ChromeDriver()
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		   		
        driver.get("http://magnus.jalatechnologies.com/");
        driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
  	    driver.findElement(By.id("Password")).sendKeys("jobprogram");
  	    driver.findElement(By.id("btnLogin")).click();
  	    driver.close();
  	    }   
}


