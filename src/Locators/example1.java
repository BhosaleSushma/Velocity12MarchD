package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1

{
	

		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in");
			Thread.sleep(2000);
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("handbags");
			Thread.sleep(2000);
			
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.linkText("Black Leather Handbag For Women")).click();		
		}
	


}
