import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.ie.driver","C:\\Users\\vnasa\\Documents\\Work\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.amazon.in");
		System.out.println(driver.getCurrentUrl());
	}

}
