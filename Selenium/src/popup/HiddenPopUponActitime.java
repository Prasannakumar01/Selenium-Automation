package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenPopUponActitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(34));
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		driver.findElement(By.xpath("(//td[@class='selection'])[1]")).click();
		driver.findElement(By.xpath("(//div[text()='Delete'])[1]")).click();
	//	String message=driver.findElement(By.xpath("//div[text()='You are about to delete 65 tasks']")).getText();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
	String msg=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'You are about to delete 65 tasks')]"))).getText();
	Thread.sleep(3000);
		System.out.println(msg);
		driver.quit();
		
		
		
	}

}
