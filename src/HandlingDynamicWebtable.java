import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicWebtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnasa\\Documents\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
         System.out.println(driver.getTitle());
		
		
		for(int i=2;i<=197;i++)
		{
		
			String first_xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/table[1]/tbody[1]/tr[";
			String second_xpath = "]/td[2]/strong[1]";
			
		///html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/table[1]/tbody[1]/tr[8]/td[2]/strong[1]
		
		String nameValue = driver.findElement(By.xpath(first_xpath+i+second_xpath)).getText();
		System.out.println(nameValue);
		
		if(nameValue.contains("Argentina")) {
			
			driver.findElement(By.xpath(first_xpath+i+"]/td[1]/input[1]")).click();
		}
		
		
		}

	}

}
