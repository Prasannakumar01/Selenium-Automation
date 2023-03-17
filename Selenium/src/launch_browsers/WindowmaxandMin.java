package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowmaxandMin {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D://selenium//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.com");
	 Thread.sleep(4000);
	 
	 driver.manage().window().maximize();
	 
	 Thread.sleep(3000);
	 
	 driver.manage().window().minimize();
	 Thread.sleep(4000);
	 driver.close();
	 }

}
