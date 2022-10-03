package SeleniumScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickEvent 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		   		
        driver.get("https://www.browserstack.com/");
        Actions act = new Actions(driver);
        WebElement trial = driver.findElement(By.id("free-trial-link-anchor"));
        act.doubleClick(trial).perform();
        driver.close();
	}

}
