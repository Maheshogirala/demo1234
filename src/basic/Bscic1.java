package basic;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bscic1 {

	public static void main(String[] args) throws InterruptedException {
		int a;
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("maheshogirala");
		driver.findElement(By.id("password")).sendKeys("1L1RJY");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("location"));
		WebElement dr=driver.findElement(By.id("location"));
		Select drop = new Select(dr);
	    List<WebElement> drop1 = drop.getOptions();
	    
	    a = drop.getOptions().size();
	    System.out.println(a);
	    
//		for(WebElement all : drop1){
//			System.out.println(all.getText());
//		}
	    
	   for(int i=1;i<=a;i++){
	    	
	    	if(i==3){
	    		drop.selectByIndex(i);
	    		break;
	    	}
	    	
	    	System.out.println(drop1.get(i).getText());
	    	Thread.sleep(2000);
	    
	    	
	    }

		

	}

}
