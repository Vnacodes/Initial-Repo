import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendar {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnasa\\Documents\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		driver.findElement(By.xpath("//input[@class='ui-datepicker-calendar']/table/tbody/tr/td/a")).click();
		
		

	}

}
