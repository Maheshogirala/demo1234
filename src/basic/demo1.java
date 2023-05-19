package basic;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.redbus.com/");
		driver.get("https://phptravels.net/");
		driver.manage().window().maximize();
		
		    // 1) one way of selecting the calendar
		
		int day  = 30;
	     //driver.findElement(By.id("date-box")).click();
	     driver.findElement(By.id("checkin")).click();
	         
//driver.findElement(By.xpath("//*[@id=\"rdc-root\"]/div/div[1]/div[2]/div[2]/div//span[text()="+day+"]")).click();
driver.findElement(By.xpath("//*[@id='fadein']/div[8]/div[1]/table//td[text()="+day+"]")).click();

            // 2) how to Eliminate  the Disable dates and previace month and post month dates
//*[@id="fadein"]/div[8]/div[1]/table//td[not(contains(@class,' old'))]

//*[@id="rdc-root"]/div/div[1]/div[2]/div[2]/div/div/div[1]/span//div//span[not(contains(@class,'leGhkM'))

           // 3)  Enter the client given date , if  its any formate 

     // user given date 25/feb/2024
         String userdate = "25/feb/2024";  // user given date im taken in String formate 
         SimpleDateFormat  setdateformate = new SimpleDateFormat("dd/MMM/yyyy"); // taking the one SimpleDateFormat class and im assign the format
         Date Formatedate = setdateformate.parse(userdate);
            //System.out.println(Formatedate);
         
    




	}

}
