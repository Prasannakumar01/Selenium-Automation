package xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessFlipkart_PrintProductname_price {

	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.Chrome.Driver", "D://selenium//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    WebElement element=	 driver.findElement(By.xpath("//input[@class='_3704LK']"));
	    element.sendKeys("iphone 11");
	    element.submit();
		 List<WebElement> title =driver.findElements(By.xpath("(//div[@class='_4rR01T'])[1]"));
		// System.out.println("Title of the first element:"+title);
		List<WebElement> price=driver.findElements(By.xpath("((//div[@class='_4rR01T'])[1]/../following-sibling::div/div/div[1]/div)[1]"));
		 for(WebElement Element : title) {
			 for(WebElement Elements : price) {
				 
			 System.out.println(Element.getText()+"------>"+Elements.getText());
		 }
		 }
		 driver.quit();
		 
	}

}
