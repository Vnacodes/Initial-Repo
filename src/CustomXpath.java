import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnasa\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/flight-booking/kingfisher-airlines.html");
		
		//custom xpath for ay tag:
		driver.findElement(By.xpath("//span[@class='cleartripLogo']")).click();
		
		//custom xpath for link - //a[contains(text(),'linktext')]
		// driver.findElement(By.xpath("//a[contains(text(),'Display as grid')]")).click(); note: this for some other site
		
	}

}
