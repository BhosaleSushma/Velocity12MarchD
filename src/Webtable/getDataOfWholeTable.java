package Webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getDataOfWholeTable
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/Desktop/Fold/WebTable.html");
		//print all headings
		for(int k=1;k<=3;k++)
		{
			String heading=driver.findElement(By.xpath("//table[@id=\"’1234’\"]//tr/th["+k+"]")).getText();
			System.out.println(heading+" ");
		}
		//print whole data
		for(int i=2;i<=5;i++)            //condition for row
		{
			
			for(int j=1;j<=3;j++)       //condition for column
			{
				String alldata=driver.findElement(By.xpath("//table[@id=\"’1234’\"]//tr["+i+"]/td["+j+"]")).getText();
				System.out.print(alldata+" ");
			}
			System.out.println();
		}

}
}