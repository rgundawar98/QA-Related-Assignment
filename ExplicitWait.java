package SeleniumScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.util.Timeout;

public class ExplicitWait 
{
	WebDriver driver;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		WebDriverwait();
//		WebDriverWait wait = new WebDriverWait(driver, 20); 
		String eTitle = "Login";
		String aTitle = "";
        driver.get("http://magnus.jalatechnologies.com/");
        if (aTitle.contentEquals(eTitle))
    	{
    	System.out.println( "Test Passed") ;
    	}
    	else {
    	System.out.println( "Test Failed" );
    	}
        WebElement link;
//        link = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/Account/ForgotPassword']")));
//        link.click();
	}

	private static void WebDriverwait() {
		// TODO Auto-generated method stub
		
	}

}

