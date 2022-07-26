package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relative_xpath_using_Attribute 
{
	
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(2000);
			
			// enter username
			driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys("Admin");
		
			//enter password
			driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
		
			//click on login button
			driver.findElement(By.xpath("//input[@value=\"LOGIN\"]")).click();
			}

	


}
