import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vnasa\\\\Downloads\\\\New folder\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(""); //couldnt find site with frames :(
	}

}
