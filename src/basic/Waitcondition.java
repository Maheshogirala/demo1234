package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitcondition {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome driver\\New folder\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		FileInputStream f1 = new FileInputStream("C:\\Users\\Personal\\workspace\\Demo\\src\\basic\\data.properties");
		Properties p1= new Properties();
		p1.load(f1);
		d1.get(p1.getProperty("url"));
		d1.manage().window().maximize();
		//d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// explicit wait - to wait for the compose button to be click-able
		WebDriverWait wait = new WebDriverWait(d1,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		d1.findElement(By.name("username")).sendKeys(p1.getProperty("username"));
		d1.findElement(By.name("password")).sendKeys(p1.getProperty("passwoard"));
		d1.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		// explicit wait - to wait for the compose button to be click-able
	WebDriverWait wait1 = new WebDriverWait(d1,30);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")));
		
		d1.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		
		
	}

}
