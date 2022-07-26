package Webtable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class columnSize
{
	
		//to get number of column present in table
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/lenovo/Desktop/Fold/WebTable.html");

			int columnsize=driver.findElements(By.xpath("//table[@id=\"’1234’\"]//tr[2]/td")).size();
			System.out.println("No. of columns presnt are: "+columnsize);
		}

	


}
