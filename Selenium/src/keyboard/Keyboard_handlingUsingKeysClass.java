package keyboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_handlingUsingKeysClass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin", Keys.TAB, "manager",
				Keys.ENTER);
		driver.manage().window().maximize();

		System.out.println("login has been created  by using key class successfully");
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		System.out.println("logout has been done by using keys class successfully");

		driver.quit();
		System.out.println("The browser has been closed");
	}
}
