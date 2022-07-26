package Webtable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class rowSize 
{
	
	 //to get number of rows present in webtable
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/lenovo/Desktop/Fold/WebTable.html");
			
			List<WebElement> row=driver.findElements(By.xpath("//table[@id=\"’1234’\"]//tr"));
			int sizeofRow=row.size();
			System.out.println("No. of rows present in table are: "+sizeofRow);
		}

	


}
