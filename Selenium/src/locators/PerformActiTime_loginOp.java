package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PerformActiTime_loginOp {
WebDriver driver;


public void Launch() throws InterruptedException {
	 driver= new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
	driver.get("http://demo.actitime.com/login.do");
	Thread.sleep(3000);
}
public void login() throws InterruptedException {
	driver.findElement(By.id("username")).sendKeys("admin");
	Thread.sleep(3000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(3000);
	driver.findElement(By.className("initial")).click();
	Thread.sleep(3000);
}	
	public void closeBrowser(){
		driver.quit();
		System.out.println("The login page has been launched and closed");
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		PerformActiTime_loginOp actTimeOp=new PerformActiTime_loginOp();
		actTimeOp.Launch();
		Thread.sleep(3000);
		actTimeOp.login();
		Thread.sleep(3000);
		actTimeOp.closeBrowser();

	}

}
