package ListBox_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3
{
	

		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.spicejet.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[text()=\"Currency\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()=\"CNY\"]")).click();

		}

	


}
