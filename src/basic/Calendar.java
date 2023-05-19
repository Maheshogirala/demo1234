package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
		int day = 15;
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody//a[text()="+15+"]")).click();
		
		
		

	}

}
