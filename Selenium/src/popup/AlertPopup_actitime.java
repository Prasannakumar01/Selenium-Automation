package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup_actitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://selenium//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.xpath("//div[@id='ext-gen7']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Krishna");
		driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
		
		Alert alt= driver.switchTo().alert();
		String s=alt.getText();
		System.out.println(s);
		alt.accept();
		//alt.dismiss();
		driver.quit();

	}

}
