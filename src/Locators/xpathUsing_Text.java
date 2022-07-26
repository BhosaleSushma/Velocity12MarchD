package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpathUsing_Text
{
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file://C:/Users/lenovo/Desktop/Fold/Demo.html");
			driver.findElement(By.xpath("//a[text()=\"Facebook\"]")).click();
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			driver.findElement(By.xpath("//a[text()=\"Google\"]")).click();
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			driver.findElement(By.xpath("//a[text()=\"Amazon\"]")).click();
			Thread.sleep(2000);
			
			driver.quit();
		
		}
	


}
