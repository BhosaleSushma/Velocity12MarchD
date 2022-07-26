package webDriver_Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class getCurrent_url 
{
	
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			String url=driver.getCurrentUrl();
			System.out.println(url);
			//testcase1: Verify that user is launch correct url
			if(url.equalsIgnoreCase("https://www.flipkart.com/"))
			{
				System.out.println("Test case is passed");
			}
			else
			{
				System.out.println("Test case is failed");
			}
			Thread.sleep(2000);
			driver.quit();
		}
	


}
