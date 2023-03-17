package xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Accessflipkart {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement element =driver.findElement(By.xpath("//input[@class='_3704LK']"));
		element. sendKeys("iphone11");
		element.submit();
		
		List<WebElement> productnames=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for(WebElement elements:productnames) {
			System.out.println(elements.getText());
		}
		
	}

}
