import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnasa\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
		
		//gets a child popup, get handle or inspect that we need getWindowHandles() method
		
		Set<String> handler = driver.getWindowHandles();
		
		//since set object is not stored like list that is in indexes, we use iterator to get values 
		
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next(); //to store values in handler object(also next is used to point to the first value)
		
		System.out.println("Parent window id: "+parentWindowId);
		
		String childWindowId = it.next(); //to store child window id
		
		System.out.println("Child window id: "+childWindowId); 
		
		//now that we got id's of both windows, we can use switchTo() method to switch to particular window
		
		driver.switchTo().window(childWindowId); //focus switches to child window popup
		
		System.out.println("Child window's title: "+driver.getTitle());	
		
		driver.close(); //to close the child window
		
        driver.switchTo().window(parentWindowId); //focus switches to child window popup
		
		System.out.println("Parent window's title: "+driver.getTitle());	
		
		

	}



}
