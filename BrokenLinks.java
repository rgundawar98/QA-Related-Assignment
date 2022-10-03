package SeleniumScenarios;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
        driver.get("http://www.zlti.com");
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        Iterator<WebElement> it = links.iterator();
         
        while(it.hasNext())
        {
           String url = it.next().getAttribute("href");
            
            System.out.println("url");
            
            if(url == null || url.isEmpty()){
            	System.out.println("URL is either not configured for anchor tag or it is empty");
            	                continue;
            	            }
            if(!url.startsWith(url)){
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }
        }
      
	}

}
