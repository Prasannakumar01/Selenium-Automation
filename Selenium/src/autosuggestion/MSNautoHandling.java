package autosuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MSNautoHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.msn.com/en-in?pc=W099&ocid=MSNHP_W099&AR=1");
		WebElement element = driver.findElement(By.xpath(""));

		SearchContext first = element.getShadowRoot();

		WebElement element1 = first.findElement(By.xpath(""));

		element.getShadowRoot();

	}

}
