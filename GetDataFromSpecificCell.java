package SeleniumScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDataFromSpecificCell 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("No of rows are :"+rows.size());
        
        List<WebElement> column = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
        System.out.println("No of columns are :"+column.size());
        
        WebElement celladdress =driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[5]"));
        String val = celladdress.getText();
        System.out.println("The cell value is :"+val);
        
        driver.quit();

	}

}
