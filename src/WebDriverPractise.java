import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vnasa\\Downloads\\New folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.fb.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ananya");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		
		//driver.quit();

	}

}
