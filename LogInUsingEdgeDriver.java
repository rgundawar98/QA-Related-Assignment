package AutomateLogIn;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LogInUsingEdgeDriver 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://magnus.jalatechnologies.com/");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
  	    driver.findElement(By.id("Password")).sendKeys("jobprogram");
  	    driver.findElement(By.id("btnLogin")).click();
  	    driver.close();		

	}

}
