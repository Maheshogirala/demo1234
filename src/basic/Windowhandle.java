package basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/windows/#windows-and-tabs");
		driver.manage().window().maximize();
		
		//String parant = driver.getWindowHandle();
		//System.out.println(parant);
		
        //Thread.sleep(3000);
         driver.findElement(By.linkText("new window")).click();
         
      // String child= driver.getWindowHandle();
        // Thread.sleep(3000);
   //System.out.println(child);
   
  Set<String> s = driver.getWindowHandles();
  
  Iterator it = s.iterator();
 String parant1=  (String) it.next();
 String child1 = (String) it.next();
 System.out.println(parant1);
 System.out.println(child1);
  /*System.out.println(parant1);
  System.out.println(child1);
  
   driver.switchTo().window(child1);
   Thread.sleep(3000);
   driver.findElement(By.linkText("Get Tickets")).click();
   */
   
	}

}
