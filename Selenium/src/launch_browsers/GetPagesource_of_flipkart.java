package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPagesource_of_flipkart {

	public static void main(String[] args) {
	          System.setProperty("Webdriver.chrome.Driver","D:\\Selenium\\chromedriver.exe");
	         ChromeDriver driver=new ChromeDriver();
	         driver.get("https://www.flipkart.com");
	         
	         String url=driver.getCurrentUrl();
	         System.out.println("url is : "+url);
	         String sourcecode=driver.getPageSource();
	         System.out.println(sourcecode);
	}
	

}
