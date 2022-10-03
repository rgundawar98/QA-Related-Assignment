package SeleniumScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEvents 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Actions act = new Actions(driver);
		WebElement tgt =driver.findElement(By.xpath("//span[text()='Become a Seller'][1]"));
		WebElement tgt2 = driver.findElement(By.xpath("//a[text()='FAQs']"));
		act.moveToElement(tgt).perform();
		Thread.sleep(2000);
		act.moveToElement(tgt2).perform();
	}
}
