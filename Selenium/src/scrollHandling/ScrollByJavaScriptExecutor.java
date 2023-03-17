package scrollHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollByJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://selenium//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@class='_3704LK']"));
		element.sendKeys("iphones");
		element.submit();
		//Here we need to downcast the JavaScriptExecutor inorder to use.
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript(" window.scrollBy(0,2000)");
		Thread.sleep(3000);
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.());
		Thread.sleep(4000);
	//	jse.executeScript("window.scrollBy(0,5000");
		
		//driver.quit();
	}

}
