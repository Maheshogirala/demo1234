package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker");
		driver.manage().window().maximize();
		
		
 // 1) one way of selecting the calendar
		
		int day  = 27;
		driver.findElement(By.id("datepicker")).click();
	         
driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table//a[text()="+day+"]")).click();
		
	// 2) 	
		
		
		

	}

}
