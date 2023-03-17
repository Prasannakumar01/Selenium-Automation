package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_the_Google {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://classroom.google.com/r/NTU2NzA5ODUzNTYx/sort-last-name");
		String title= driver.getTitle();
		System.out.println(title);	
	}

}
