package calendar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_handling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https:/jqueryui.com/resources/demos/datepicker/default.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
		String date = driver.findElement(By.xpath("//a[text()='31']")).getText();
		System.out.println("The last date of the month" + date);
		Thread.sleep(2000);
		String selectedDate = driver.findElement(By.xpath("//input[@class='hasDatepicker']")).getText();
		System.out.println(selectedDate);

	}

}
