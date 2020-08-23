import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnasa\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/flight-booking/kingfisher-airlines.html");
		
		Actions action = new Actions(driver); //used for mouse movement
		
		action.moveToElement(driver.findElement(By.id("flights-menu"))).build().perform();
		
		driver.findElement(By.linkText("Kingfisher Web Check-in")).click();
		
		
	}

}
