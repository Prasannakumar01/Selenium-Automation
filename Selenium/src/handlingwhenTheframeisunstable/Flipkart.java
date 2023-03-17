package handlingwhenTheframeisunstable;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Gaming']"))).build().perform();
		
		List<WebElement> element=driver.findElements(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		for(WebElement ele:element) {
			String s=ele.getText();
			System.out.println(s );
		}
	}
	

}
