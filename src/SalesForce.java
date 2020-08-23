import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnasa\\Documents\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys("VeenaSadafule");
		driver.findElement(By.name("pw")).sendKeys("123456");
		//driver.findElement(By.xpath("//*[@id='Login']")).click(); //Java does not allow double quotes within double quotes.
		//so use single quotes for id for xpath.
		driver.findElement(By.cssSelector("#Login")).click();
	}

}
