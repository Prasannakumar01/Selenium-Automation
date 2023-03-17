package launch_browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gekodriver.driver","D://selenium//gekodriver.exe");
         FirefoxDriver driver= new FirefoxDriver();
         driver.get("https://www.flipkart.com");
         driver.close();
	}

}
