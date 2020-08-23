import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowserTestingConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnasa\\Documents\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//	WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://ui.freecrm.com/");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("email")).sendKeys("wnasadafule@gmail.com");;
		driver.findElement(By.name("password")).sendKeys("Vaishali@1");;
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());

	}

}
