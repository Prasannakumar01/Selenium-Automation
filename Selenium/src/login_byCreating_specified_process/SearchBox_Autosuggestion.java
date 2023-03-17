package login_byCreating_specified_process;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBox_Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shoes");
		List<WebElement> element=driver.findElements(By.xpath("//li[@class='Y5N33s']"));
		for(WebElement suggestions:element) {
			//String autosuggestion=suggestions.getText();
			System.out.println(suggestions.getText());}
			driver.quit();
	}

}
