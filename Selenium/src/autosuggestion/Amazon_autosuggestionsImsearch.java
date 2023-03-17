package autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_autosuggestionsImsearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://WWW.amazon.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement e = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		e.sendKeys("phones");
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		// wait.until(ExpectedConditions.(e));
		List<WebElement> element = driver.findElements(By.xpath("//div[@id='nav-flyout-searchAjax']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		// wait.until(ExpectedConditions.(element));
		for (WebElement suggestions : element) {
			System.out.println(suggestions.getText());

		}
		driver.quit();
	}

}
