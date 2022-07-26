package webDriver_Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class nevigate 
{
	
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.simplilearn.com/tutorials/selenium-tutorial/selenium-interview-questions-and-answers");
			driver.get("https://www.google.com/");
			driver.get("https://www.facebook.com/");
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.navigate().back();
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			driver.quit();	
		}
	


}
