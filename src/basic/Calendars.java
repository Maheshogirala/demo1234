package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendars {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
	    driver.manage().window().maximize();
	    
	     driver.findElement(By.id("second_date_picker")).click();
	     
	   //*[@ class="ui-datepicker-calendar"]//a[text()=14]
	     
	     
	   //  int day = 20;
	     
	   //*[@ class="ui-datepicker-calendar"]//a[text()="+date+"]
	   //*[@ class="ui-datepicker-calendar"]//a[text()=23]
	     
	  // driver.findElement(By.xpath("//*[@ class='ui-datepicker-calendar']//a[text()="+day+" ]")).click();
	
	     //driver.findElement(By.xpath("//table[@ class='ui-datepicker-calendar']//a[text()=23]")).click();
	
	     driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()=27]")).click();
	     
	   //*[@id="ui-datepicker-div"]/table//td[contains(@class,'ui-datepicker-other-month')]/a[text()=27]
	     
	}

}
