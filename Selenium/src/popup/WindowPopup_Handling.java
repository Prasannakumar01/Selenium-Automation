package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup_Handling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.xpath("//button[text()='✕']")).click();

		WebElement search = driver.findElement(By.cssSelector("[placeholder='Search for products, brands and more']"));
		search.sendKeys("iphone 11");
		search.submit();

		driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 64 GB)']")).click();
		String parentId = driver.getWindowHandle();
		Set<String> childId = driver.getWindowHandles();
		for (String allId : childId) {
			if (!parentId.equals(allId)) 
			{
				driver.switchTo().window(allId);
			}
		String text = driver.findElement(By.xpath("//span[text()='APPLE iPhone 11 (White, 64 GB)']")).getText();
		System.out.println(text);

		}

	}

}
