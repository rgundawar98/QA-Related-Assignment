package RadioButtonORTextBox;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelecteRadioBtn 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://en-gb.facebook.com/reg/");
	    driver.findElement(By.xpath("//label[text()='Female']")).click();
        System.out.println("Its Working");
		driver.close();
	}

}
