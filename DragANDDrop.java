package SeleniumScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragANDDrop 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		Actions act = new Actions(driver);
		
		WebElement from = driver.findElement(By.id("column-a"));
		WebElement to = driver.findElement(By.id("column-b"));
        
		act.dragAndDrop(from, to).perform();
		
		String textTo = to.getText();
		
		if(textTo.equals("Dropped"))
		{
			System.out.println("PASS :File is dropped to targetas expected "); 
		}else{
			System.out.println("FAIL: File not working ");
		}
		driver.close();
	}
}
