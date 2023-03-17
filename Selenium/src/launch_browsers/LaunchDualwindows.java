package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDualwindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(3000);
		driver.navigate().to("https://www.Myntra.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println("Title of the webpage is "+title);
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
	}

}
