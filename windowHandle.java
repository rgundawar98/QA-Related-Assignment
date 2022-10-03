package WebDriverAPI;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
         
		driver.get("https://www.linkedin.com/login");
		WebElement join = driver.findElement(By.id("join_now"));
		join.click();
		
		String mainwindow = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		Iterator<String> it =all.iterator();
		while(it.hasNext())
		{
			String childwindow = it.next();
			if(!mainwindow.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
				WebElement signin =driver.findElement(By.className("main__sign-in-link"));
				signin.click();
				
			}
		}
		driver.close();
		

	}

}
