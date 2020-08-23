import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnasa\\Documents\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://api.cogmento.com/register/");
		
		//1. isDisplayed() method: applicable for all elements
		Boolean b = driver.findElement(By.xpath("//button[@name='action']")).isDisplayed();
		System.out.println(b); //true
		
		//isEnabled(): applicable is for buttons
		Boolean b2 = driver.findElement(By.xpath("//button[@name='action']")).isEnabled();
		System.out.println(b2); //true
		
		//isSelected() method : applicable for radio buttons,check box,drop down
		Boolean b3 = driver.findElement(By.id("terms")).isSelected();
		System.out.println(b3); //false
		
		//when the checkbox is selected
		driver.findElement(By.id("terms")).click();
		Boolean b4 = driver.findElement(By.id("terms")).isSelected();
		System.out.println(b4); //true
		
		driver.close();

	}

}
