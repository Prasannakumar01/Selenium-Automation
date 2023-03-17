package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://WWW.amazon.do");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("trouser");
		Thread.sleep(3000);
		List<WebElement> element = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']"));
		Thread.sleep(3000);
		for (WebElement suggestions : element) {
			System.out.println(suggestions.getText());
		}
		driver.quit();
	}
}
