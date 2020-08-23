import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnasa\\Documents\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.get("https://www.wikipedia.com");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.close();
	}

}
