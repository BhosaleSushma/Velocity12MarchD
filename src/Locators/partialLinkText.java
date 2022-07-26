package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class partialLinkText 
{
	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file://C:/Users/lenovo/Desktop/Fold/Demo.html");
			Thread.sleep(2000);
			
			driver.findElement(By.partialLinkText("oo")).click();

		}

	


}
