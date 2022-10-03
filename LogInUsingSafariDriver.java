package AutomateLogIn;

import org.openqa.selenium.By;
import org.openqa.selenium.safari.SafariDriver;

public class LogInUsingSafariDriver 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
		SafariDriver driver = new SafariDriver();
		driver.get("http://magnus.jalatechnologies.com/");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
  	    driver.findElement(By.id("Password")).sendKeys("jobprogram");
  	    driver.findElement(By.id("btnLogin")).click();
  	    driver.close();		

	}

}
