package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_printSuggestions {
	WebDriver driver;

	public void Launchbrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
	}

	public void searchForshoes() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shoes");
		Thread.sleep(3000);

	}

	public void Execution() throws InterruptedException {
		List<WebElement> element = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
		Thread.sleep(3000);
		for (WebElement suggestions : element) {
			// String autosuggestion=suggestions.getText();
			System.out.println(suggestions.getText());
		}
	}

	public void closeBrowser() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		Flipkart_printSuggestions sug = new Flipkart_printSuggestions();

		sug.Launchbrowser();
		Thread.sleep(3000);
		sug.searchForshoes();
		Thread.sleep(3000);
		sug.Execution();
		Thread.sleep(3000);
		sug.closeBrowser();

	}

}
