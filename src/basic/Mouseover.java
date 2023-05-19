package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Mouseover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		// mouse over actions
 Actions act = new Actions (driver);
 
 //act.moveToElement(null);
 Thread.sleep(3000);
/* act
 .moveToElement(driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[2]/a")))   
 .moveToElement(driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[2]/div/div/div/div/ul/li[3]")))
 .moveToElement(driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[2]/div/div/div/div/ul/li[3]/div/div/h6[4]/a")))
 .click()
 .perform();
 System.out.println(driver.getTitle());
 */
 // ClICK actions
     // 1) double click
 
 driver.findElement(By.xpath("//*[@id='Form_getForm_Email']")).sendKeys("MAHESH");
 Thread.sleep(3000);
 /*act.doubleClick(driver.findElement(By.xpath("//*[@id='Form_getForm_Email']"))).perform();
 
 
 // 2) Right click
 
 act.doubleClick(driver.findElement(By.xpath("//*[@id='Form_getForm_Email']"))).contextClick().perform();
 */
 
 // 3) Keyboard actions CNTL+A
 
 act.keyDown(Keys.CONTROL);
 act.sendKeys("a");
 act.keyUp(Keys.CONTROL);
 act.perform();
 Thread.sleep(5000);
 
 act.sendKeys(Keys.DELETE);
 act.perform();
		
	}

}
