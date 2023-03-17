package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Myntra_autosuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Edge.driver", "D://selenium//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"))
				.sendKeys("headphones");
		Thread.sleep(3000);
		List<WebElement> element = driver.findElements(By.xpath("//ul[@class='desktop-group']"));
		for (WebElement suggestions : element) {
			System.out.println(suggestions.getText());

		}
		driver.quit();
	}

}
