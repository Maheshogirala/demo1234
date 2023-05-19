package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ClassA {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement srcElm=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement trgElm=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		//act.dragAndDrop(srcElm, trgElm).build().perform();
		act.clickAndHold(srcElm).moveToElement(trgElm).release().build().perform();
		Thread.sleep(3000);
		//driver.close();
		
       
     
        
        
        
        
        
        
        
		
         
	}

}
