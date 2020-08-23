import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UsingPropertyFile {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		
		FileInputStream io = new FileInputStream("C:\\Users\\vnasa\\eclipse-workspace\\Intro\\src\\config.properties");
		
		prop.load(io);
		
		System.out.println(prop.getProperty("name"));
		String age = prop.getProperty("age");
		System.out.println(age);
		String url = prop.getProperty("url");
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnasa\\Downloads\\New folder\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\vnasa\\Documents\\Work\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("ie")){
				System.setProperty("webdriver.ie.driver", "C:\\Users\\vnasa\\Documents\\Work\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
		}
		
		driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("username_xpath"))).sendKeys(prop.getProperty("name"));
		driver.findElement(By.xpath(prop.getProperty("pwd_xpath"))).sendKeys(age);
		driver.findElement(By.xpath(prop.getProperty("submit_xpath"))).click();

	}

}
