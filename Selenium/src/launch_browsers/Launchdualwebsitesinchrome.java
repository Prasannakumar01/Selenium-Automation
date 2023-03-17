package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchdualwebsitesinchrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		Thread.sleep(4000);
		String url1=driver.getCurrentUrl();
		System.out.println("url of the first application is :"+url1);
        driver.get("https://www.actitime.com/login.do");
        String url=driver.getCurrentUrl();
        System.out.println("url of the second application is :"+url);
        driver.close();
	}

}
