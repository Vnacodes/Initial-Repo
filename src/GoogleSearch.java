import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnasa\\Documents\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("testing");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/div/div/div[@class='sbl1']"));

		System.out.println("No of items in the search list is "+ list.size());
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().matches("testing techniques"))
			{
			   list.get(i).click();
			   break;
			}
			
			
				
		}
	}

}
