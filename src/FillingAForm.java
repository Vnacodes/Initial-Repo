import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillingAForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnasa\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Fred");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Weasley");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9090909090");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Fred@hogwards.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("top floor");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("wander place");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Magic Arena");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("9 3/4");
		
		Select select = new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText("GERMANY");
		
		driver.findElement(By.id("email")).sendKeys("Freddie");
		driver.findElement(By.name("password")).sendKeys("magicpotion");
		driver.findElement(By.name("confirmPassword")).sendKeys("magicpotion");
		driver.findElement(By.name("submit")).click();;

	}

}
