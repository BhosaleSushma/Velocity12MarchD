package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id 
{
	

		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			WebElement ele=driver.findElement(By.id("txtUsername"));
			Thread.sleep(2000);
			ele.sendKeys("Admin");
			Thread.sleep(1000);
			
			WebElement pass=driver.findElement(By.id("txtPassword"));
			Thread.sleep(2000);
			pass.sendKeys("admin123");
			Thread.sleep(1000);
			
			WebElement login=driver.findElement(By.id("btnLogin"));
			Thread.sleep(2000);
			login.click();
			
			Thread.sleep(2000);
			driver.quit();
		}
	


}
