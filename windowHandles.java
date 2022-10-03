package WebDriverAPI;

import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		

		driver.get("https://en-gb.facebook.com/reg/");
		driver.navigate().to("https://en-gb.facebook.com/login/?");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
	}

}
