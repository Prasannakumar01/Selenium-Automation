package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_overHandling_Message {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","D://selenium//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement element=driver.findElement(By.xpath("//input[@title='Do not select if this computer is shared']"));
		String title=element.getAttribute("title");
		System.out.println("H_over messages:"+title);
		
		if(element.isDisplayed()) {
			System.out.println("The check box Element is diplayed ");
		}
		else {
			System.out.println("The checkbox Element is not displayed");
		}
		
		if(element.isEnabled()) {
			System.out.println("The checkbox element is enabled");	
		}
		else {
			System.out.println("The checkbox element disabled");
		}
		
		if(element.isSelected()) {
			System.out.println("The check box element is selected");
		}
		else {
			System.out.println("The checkbox element is not selected");
		}

}}
