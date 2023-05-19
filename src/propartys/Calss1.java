package propartys;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calss1 {

	public static void main(String[] args) throws IOException {
		// Using the properties list first u read the data 
		// read the data syntext is
		
		FileInputStream a1= new FileInputStream("C:\\Users\\Personal\\workspace\\Demo\\src\\propartys\\data.properties");
		
		// step 2 create the  object for properties 
		
		Properties p1 = new Properties();
		
		// load the date in FileInputStream to Properties
		
		p1.load(a1);
		
		// write the regular data like webdriver invocing
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome driver\\New folder\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		
		d1.get(p1.getProperty("url"));
		
		d1.manage().window().maximize();
		
		d1.findElement(By.id("username")).sendKeys(p1.getProperty("username"));
		d1.findElement(By.id("password")).sendKeys(p1.getProperty("passwoard"));
		d1.findElement(By.id("loginbtn")).click();
		
		
		
		
		

	}

}
