package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname 
{
	
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("C:\\Users\\shree\\Desktop\\HTMLcode\\demo.html");
			Thread.sleep(2000);
			
			driver.findElement(By.className("123")).sendKeys("abd");
			
			Thread.sleep(2000);
			
			driver.findElement(By.className("234")).sendKeys("xyz");
		}

	


}
