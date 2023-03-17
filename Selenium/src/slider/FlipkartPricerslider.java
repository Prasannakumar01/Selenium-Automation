package slider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartPricerslider {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("blazzers");
		element.submit();

		WebElement slider1 = driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
		WebElement slider2 = driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider2, 300, 0);
		act.dragAndDropBy(slider1, -300, 0);
		act.build();
		act.perform();

		driver.quit();

	}

}
