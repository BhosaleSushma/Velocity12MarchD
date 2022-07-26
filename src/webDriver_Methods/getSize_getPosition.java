package webDriver_Methods;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class getSize_getPosition
{
	
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			//getSize():This method is used to get current size browser 
			Dimension d=driver.manage().window().getSize();
			System.out.println(d);
			
			//getPosition():This method is used to get current position browser 
			Point p=driver.manage().window().getPosition();
			System.out.println(p);	
		}
	


}
