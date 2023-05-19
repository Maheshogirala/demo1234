package basic;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Duration;

public class Frames {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	    driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// Enter into  frame 
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame1);
		Thread.sleep(3000);
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(frame3);
		
		// Click on Inner Frame Check box
		driver.findElement(By.xpath("//b[text()='Inner Frame Check box :']/following-sibling::input[@id='a']")).click();
		Thread.sleep(1000);
		
		
		// Enter into Second frame
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(frame2);
		

	}

}
