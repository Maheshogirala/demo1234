package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/clothing-and-accessories/bottomwear/pr?sid=clo,vua&p[]=facets.ideal_for%255B%255D%3DMen&p[]=facets.ideal_for%255B%255D%3Dmen&otracker=categorytree&fm=neo%2Fmerchandising&iid=M_77e5d985-866b-4600-8003-ec53edb34986_1_372UD5BXDFYS_MC.8HARX8UX7IX5&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BBottom%2BWear_8HARX8UX7IX5&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L1_view-all&cid=8HARX8UX7IX5");
		//	driver.get("https://demo.automationtesting.in/Slider.html");
		driver.manage().window().maximize();
		Actions act = new Actions (driver);
        Thread.sleep(3000);
        WebElement mov = driver.findElement(By.className("_3FdLqY"));
        
        
        act.dragAndDropBy(mov, 0, 30).perform();
        
        act.dragAndDropBy(mov, 0, 60).perform();
		
		/*// take the action calss
        Actions act = new Actions (driver);
        Thread.sleep(3000);
         WebElement mov = driver.findElement(By.xpath("//*[@id='slider']/a"));
         
         act.dragAndDropBy(mov, 650, 0).perform();
         */
	}

}
