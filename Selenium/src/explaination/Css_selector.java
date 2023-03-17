package explaination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.cssSelector("[placeholder='Email address or phone number']")).sendKeys("akhil");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("akhil@123");
		driver.findElement(By.className("_9lsa")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
