package webDriver_Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class getTitle 
{
	

		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			String title=driver.getTitle();
			System.out.println(title);
			//testcase1: Verify that user is navigated to correct webpage
			if(title.equalsIgnoreCase("Google"))
			{
				System.out.println("Test case is passed");
			}
			else
			{
				System.out.println("Test case is failed");
			}
			Thread.sleep(2000);
			driver.close();
		}
	


}
