package autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.Google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Virat Kohli");
		List<WebElement> element=driver.findElements(By.xpath("//div[@class='erkvQe']"));
		Thread.sleep(3000);
		for(WebElement suggestions:element) {
			String name_suggestions=suggestions.getText();
			System.out.println(name_suggestions);
		}
		driver.quit();

	}

}
