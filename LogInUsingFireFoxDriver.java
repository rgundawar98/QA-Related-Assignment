package AutomateLogIn;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LogInUsingFireFoxDriver
{
	public static void main(String[] args)
	{

		System.setProperty("webdriver.gecko.driver", "D:\\GeckoDriver\\geckodriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://magnus.jalatechnologies.com/");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
  	    driver.findElement(By.id("Password")).sendKeys("jobprogram");
  	    driver.findElement(By.id("btnLogin")).click();
  	    driver.close();

	}

}
