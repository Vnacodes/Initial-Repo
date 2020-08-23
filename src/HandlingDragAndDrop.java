import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnasa\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);  //to switch to frame if there is any
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]")))
		.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
		
		
	}

}
