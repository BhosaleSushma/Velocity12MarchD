package Webtable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getDataOfWholeColumn
{

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/lenovo/Desktop/Fold/WebTable.html");
			for(int i=1;i<=5;i++)
			{
				if(i==1)
				{
					String headcoldata=driver.findElement(By.xpath("//table[@id=\"’1234’\"]//tr["+i+"]/th[3]")).getText();
					System.out.println(headcoldata);
				}
				else
				{
					String coldata=driver.findElement(By.xpath("//table[@id=\"’1234’\"]//tr["+i+"]//td[3]")).getText();
					System.out.println(coldata);
				}
			}
		}
	


}
