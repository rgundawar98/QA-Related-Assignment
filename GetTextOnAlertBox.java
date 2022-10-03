package PopUpsANDWindows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextOnAlertBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		   		
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        
        Alert alert =driver.switchTo().alert();
        
        alert.sendKeys("Hello world !");
        
        alert.accept();         
        Thread.sleep(2000);
        
        driver.close();
        

	}

}
