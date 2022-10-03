package WebDriverAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//get() method
		driver.get("http://magnus.jalatechnologies.com/");
		
		//getCurrentUrl() method
		String val = driver.getCurrentUrl();
		System.out.println("Current Url is :"+val);
		
		//getTitle() method
		String title = driver.getTitle();
		System.out.println("Title is :"+title);
		
		//getPageSource() method
		String pagesource = driver.getPageSource();
		System.out.println("Source is :"+pagesource);
		//findElement() method
	    driver.findElement(By.id("UserName"));
	    
	    //isDisplayed() method
	    boolean display =driver.findElement(By.id("UserName")).isDisplayed();
	    System.out.println("Is Displayed "+display);
	    
	    //isEnabled() method
	    boolean enable = driver.findElement(By.id("Password")).isEnabled();
	    System.out.println("Is Enabled :"+enable);
	    
	    
	    //isSelected() method
	    boolean select = driver.findElement(By.id("UserName")).isSelected();
	    System.out.println("Is Selected :"+select);

	    //findElements() method
	    boolean b =driver.findElements(By.id("Password")).contains("placeholder= password");
	    System.out.println(""+b);

	    //getText() method
	    String text = driver.findElement(By.id("UserName")).getText();
	    System.out.println("Text is :"+text);
	    
	    //getAttribute() method
	    driver.findElement(By.id("UserName")).getAttribute("val");
	    System.out.println(""+val);

	    //SendKeys() method
	    driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
	    driver.findElement(By.id("Password")).sendKeys("jobprogram");
	    
	    //click() method
	    driver.findElement(By.id("btnLogin")).click();
	    
	    
	    //Thread.Sleep() method
	     Thread.sleep(2000);
	     
	    //getSize() method
	      Dimension size = driver.findElement(By.id("UserName")).getSize();
	      System.out.println("Dimension :"+size);
	    
	     //getLocation() method
	      org.openqa.selenium.Point point =driver.findElement(By.id("Password")).getLocation();
	      System.out.println("Point is :"+point);  
	    
		//close() method
        driver.close();
        
		//driver.quit() method
        driver.quit();
		

	}

}
