package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmUsingcssSel {

	public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	   WebElement Username=driver.findElement(By.cssSelector("[name='username']"));
	   Username.sendKeys("Admin");
	   WebElement Password=driver.findElement(By.cssSelector("[type='password']"));
	   Password.sendKeys("admin123");
	   
	   WebElement Login=driver.findElement(By.cssSelector("[type='submit']"));
	   Login.click();
	   
	   driver.quit();

	}

}
