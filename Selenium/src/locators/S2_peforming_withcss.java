package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2_peforming_withcss {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","D://selenium//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.actiTime.com/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
	driver.findElement(By.cssSelector("input[placeholder=Password]")).sendKeys("manager");
	driver.findElement(By.cssSelector("a[id='loginButton']")).click();
	driver.quit();
	}
}
