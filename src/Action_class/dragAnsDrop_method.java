package Action_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAnsDrop_method 
{
	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			Thread.sleep(2000);
			
			//step1:
			List<WebElement>ele=driver.findElements(By.xpath("//a[@class=\"button button-orange\"]"));
			WebElement drag=ele.get(1);
			WebElement drop=driver.findElement(By.xpath("//ol[@id=\"amt7\"]/li"));
			
			//step2:
			Actions act= new Actions(driver);
			
			//step3:
			act.dragAndDrop(drag, drop).perform();		
		}
	


}
