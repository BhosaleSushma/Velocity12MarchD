package webDriver_Methods;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize_setPosition
{
	
	
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			
			//setSize():This function is used to set the size of browser as per given dimensions. 
			Dimension d= new Dimension(500,500);
			driver.manage().window().setSize(d);
			System.out.println(driver.manage().window().getSize());
			Thread.sleep(2000);
			
			//setPosition():This function is used to set the position of browser as per given parameter. 
			Point p= new Point(300,300);
			driver.manage().window().setPosition(p);		
		}
	


}
