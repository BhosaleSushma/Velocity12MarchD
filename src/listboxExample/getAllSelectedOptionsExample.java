package listboxExample;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class getAllSelectedOptionsExample 
{


		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/lenovo/Desktop/Fold/Demo.html");
			Thread.sleep(1000);
			
			//Step1:
			WebElement l=driver.findElement(By.tagName("select"));
			//Step2:
			Select o= new Select(l);
			o.selectByIndex(1);
			o.selectByIndex(3);
			o.selectByIndex(4);
			
			List<WebElement> sel=o.getAllSelectedOptions();
			for(WebElement w:sel)
			{
				System.out.println(w.getText());
			}
		}
	


}
