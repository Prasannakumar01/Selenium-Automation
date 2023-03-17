package dropdownHandling;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DropdownFlipkart {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(4000);
		Actions act=new Actions(driver);
		
	WebElement element = driver.findElement(By.xpath("//div[text()='Electronics']"));
               act.moveToElement(element);
   List<WebElement>element1=driver.findElements(By.xpath("//a[text()='Audio']"));
		for(WebElement e:element1) {
			System.out.println(e);
		}
		driver.quit();
	
	
		
		
		
		

	}

	}


