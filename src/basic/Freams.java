package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Freams {

	
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome driver\\chromedriver.exe");
			WebDriver Driver = new ChromeDriver();
			
			
			Driver.get("https://jqueryui.com/datepicker/");
			Driver.manage().window().maximize();
			Driver.switchTo().frame(0);
			Thread.sleep(3000);
			Driver.findElement(By.id("datepicker")).click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath("/html/body/div/table/tbody/tr[5]/td[5]/a")).click();
			Thread.sleep(2000);
			Driver.close();

		}

	}


