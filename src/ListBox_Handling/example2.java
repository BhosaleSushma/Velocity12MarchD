package ListBox_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2
{
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Automation jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.spicejet.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[text()=\"Passengers\"]")).click();
			Thread.sleep(2000);
			WebElement adult=driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]"));
			int i=1;
			while(i<5)
			{
				adult.click();
				i++;
			}
			WebElement child=driver.findElement(By.xpath("//div[@data-testid=\"Children-testID-plus-one-cta\"]"));
			WebElement infant= driver.findElement(By.xpath("//div[@data-testid=\"Infant-testID-plus-one-cta\"]"));
			for(int j=1;j<3;j++)
			{
				child.click();
			}
			Thread.sleep(2000);
			for(int k=1;k<4;k++)
			{
				  infant.click();
			}
		}
	


}
