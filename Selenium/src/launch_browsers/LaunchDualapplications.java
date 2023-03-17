package launch_browsers;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDualapplications {

	public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver","D://selenium//chromedriver.exe");
			 ChromeDriver driver=new ChromeDriver();
			 
			 driver.get("https://www.flipkart.com");
			 Thread.sleep(4000);
			 
			 driver.get("https:www.amazon.com");
			 Thread.sleep(4000);
			 
			 driver.manage().window().maximize();
			Thread.sleep(4000);
			 
			driver.manage().window().minimize();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(4000);
			String title=driver.getTitle();
			System.out.println("Title of the window is :"+title);
			Thread.sleep(400);
			Dimension dimension=new Dimension(500,700);
			driver.manage().window().setSize(dimension);
			driver.manage().window().setPosition(new Point(400,800));
			
			Thread.sleep(4000);
			driver.close();
			
			
			
		
			
	}

}
