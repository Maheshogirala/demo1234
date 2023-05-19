package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//driver.get("https://demo.automationtesting.in/Static.html");
		
		driver.manage().window().maximize();
		// take the action class
        Actions act = new Actions (driver);
        Thread.sleep(3000);
      
        
        
        // which element you want to move, that element path will taken and saved in web element
       WebElement Drag= driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
       // which element place drop that element , that element path also taken into web element
       WebElement drop = driver.findElement(By.xpath("//*[@id='bank']"));
       WebElement Drag2 = driver.findElement(By.xpath("//*[@id='fourth']/a"));
       WebElement drop2 = driver.findElement(By.xpath("//*[@id='amt7']/li"));
       
       // and iam take the drop and down method 
      act.dragAndDrop(Drag, drop).perform();
       act.dragAndDrop(Drag2, drop2).perform();
       
       //  click and hold the target element and move to particular place and then release
		
        act.clickAndHold(Drag).moveToElement(drop).release().perform();
		Thread.sleep(3000);
		act.clickAndHold(Drag2).moveToElement(drop2).release()
		.perform();
	
        
        
        
        
        
        
        
        
        
		
		
		
		
		
		
		
		
		
	}

}
