import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vnasa\\Documents\\Work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in");
		System.out.println(driver.getCurrentUrl());
	}

}
