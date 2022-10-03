package TextBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxEnableDisableCheck 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://magnus.jalatechnologies.com/");
		WebElement query = driver.findElement(By.xpath("//input[@id='UserName']"));
		boolean val = query.isEnabled();
		System.out.println("It is Enable or Not "+val);
		boolean b =query.isDisplayed();
		System.out.println("Is Displayed or Not :"+b);
		driver.close();
	}
}
