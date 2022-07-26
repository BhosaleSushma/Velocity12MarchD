package popups;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class simple_Alert_popup 
{
	

		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@id=\"alertBox\"]")).click();
			Thread.sleep(2000);
			//Switch selenium focus from main page to alert box
			Alert a=driver.switchTo().alert();
			
			//get message present on alert box
			System.out.println(a.getText());
			
			//Click on Ok button
			a.accept();

		}

	


}
