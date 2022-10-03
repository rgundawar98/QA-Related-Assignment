package RadioButtonORTextBox;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonCount 
{
	public static <WebElements> void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://en-gb.facebook.com/reg/");
	    @SuppressWarnings("unchecked")
		List<WebElements> radiobtn = (List<WebElements>) driver.findElement(By.name("sex"));	
	    System.out.println(""+radiobtn);
	    driver.close();
	
	}
}
