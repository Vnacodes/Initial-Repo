import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//notes: Find elements is used for getting total no of link texts or get text from those links
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnasa\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/flight-booking/kingfisher-airlines.html");
		
		List<WebElement> linklist = driver.findElements(By.tagName("a")); //to get list of total no.of links in page
		
		System.out.println(linklist.size()); //the count of links
		
		
		
		for(int i=0;i<linklist.size();i++)
		{
			System.out.println(linklist.get(i).getText()); //to get linktext of all the links in page
		}
		
		driver.quit();

	}

}
