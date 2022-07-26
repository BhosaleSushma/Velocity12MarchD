package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_using_startswith 
{
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//button[starts-with(@class,\"_2KpZ6l\")])[1]")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[starts-with(text(),\"Mob\")]")).click();
		}
	


}
