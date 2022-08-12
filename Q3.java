package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q3 {
	public static void main(String[] args) 
		{
	        System.setProperty(
	            "webdriver.chrome.driver", "C:\\Users\\khan\\chrome driver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.way2automation.com/way2auto_jquery/frames-and-windows.php#load_box");
	       WebElement draggable = driver.findElement(By.xpath("//div[contains(@class,'linkbox margin-bottom-20')]//following-sibling::img"));
	       driver.findElement(By.xpath("//div[contains(@class,'linkbox margin-bottom-20')]//following-sibling::img")).click();
	              
//		builder.moveToElement(draggable).moveByOffset(6,6).click().build().perform();
	       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'linkbox margin-bottom-20')]//following-sibling::img']")));
	       
	       Actions actions = new Actions(driver); 
	       actions.dragAndDropBy( draggable, 36, 27);
	       actions.build().perform();
	       
	       
		}

}
