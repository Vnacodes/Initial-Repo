import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnasa\\Documents\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://fb.com");
		driver.findElement(By.id("email")).sendKeys("vsadafule@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.linkText("Forgotten account?")).click();
	}

}
