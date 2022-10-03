package PopUpsANDWindows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandles 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		   		
        driver.get("https://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");		
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Thread.sleep(2000);
        Alert al = driver.switchTo().alert();
        System.out.println("Alert message is => "+al.getText());
        al.accept();//Accepts the alert
//        al.dismiss();//Decline the alert
        driver.close();   
	}

}
