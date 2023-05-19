package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alartshandle {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://products.ncryptedprojects.com/bistrostays_v4/login");
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		Thread.sleep(3000);
		
		//Alert allert = driver.switchTo().alert();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"confirmResult\"]")).getText());
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().sendKeys("mahesh");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"promptResult\"]")).getText());
		
		//driver.findElement(By.xpath("//*[@id=\"userProfileImg\"]")).click();
		

	}

}
