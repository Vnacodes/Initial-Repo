import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnasa\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\vnasa\\Downloads\\New folder\\chromedriver.exe");
		
		
	}

}
