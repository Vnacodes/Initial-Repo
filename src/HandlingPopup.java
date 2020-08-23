import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnasa\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Alert alert = driver.switchTo().alert(); //to switch to popup screen
		Thread.sleep(5000);   //to wait for 5 seconds
		String text = alert.getText();   //to store the popup text
		System.out.println(text);
		alert.accept();  //to click on ok in the popup alert box
		//alert.dismiss();  //this is used when we have cancel or dismiss buttons to click and to use it
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct alert text");
				
		}
		else
		{
			System.out.println("Incorrect alert text");
		}
		
		driver.quit();

	}

}
