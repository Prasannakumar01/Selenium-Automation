package launch_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_Flipcart2 {

	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.msedge.driver", "D:\\Selenium\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();*/
		System.setProperty("webdriver.FireFox.driver", "D://Selenium//geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/b/0/AddMailService");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println("title of the browser name is:"+title);
		Thread.sleep(4000);
		driver.get("https://youtube.com/");
		String gurl = driver.getCurrentUrl();
		System.out.println("current url is : " + gurl);
		String gt = driver.getTitle();
		System.out.println("Tittle of current webpage is : " + gt);
		Thread.sleep(4000);
		driver.close();
	}
}
		