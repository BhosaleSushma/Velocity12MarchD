package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpath_using_contains 
{
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file://C:/Users/lenovo/Desktop/Fold/Demo.html");
			Thread.sleep(1000);
			//enter username
			driver.findElement(By.xpath("//input[contains(@class,\"1\")]")).sendKeys("abhgj");
			
			//enter password
			driver.findElement(By.xpath("//input[contains(@type,\"pass\")]")).sendKeys("abgc");
			
			//open facebook application
			driver.findElement(By.xpath("//a[contains(text(),\"Face\")]")).click();
			
			driver.quit();
		}

	


}
