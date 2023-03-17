package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMaximize {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D://Selenium//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.close();
		
	
	}

}
