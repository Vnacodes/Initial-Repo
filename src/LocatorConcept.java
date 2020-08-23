import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnasa\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		//1. by xpath
//		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Fred");
//		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Weasley");
//		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9090909090");
//		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Fred@hogwards.com");
//		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("top floor");
//		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("wander place");
//		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Magic Arena");
//		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("9 3/4");

		
		//2. by id (note: this is just an example, as could not see id locator for the below elements)
//		driver.findElement(By.id("firstName")).sendKeys("Fred");
//		driver.findElement(By.id("lastName")).sendKeys("Weasley");
		
		
		//3. by name
//		driver.findElement(By.name("firstName")).sendKeys("Fred");
//		driver.findElement(By.name("lastName")).sendKeys("Weasley");
		
		//4. by linkText
		//driver.findElement(By.linkText("SUPPORT")).click();
		
		//5. by partial link text
		//driver.findElement(By.partialLinkText("SIGN")).click();
		
		//6. by CSS Selector
		//driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input")).sendKeys("Weasley");
		

	}

}
