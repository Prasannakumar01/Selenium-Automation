package login_byCreating_specified_process;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Customised_process {

	WebDriver driver;

	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}

	public void Login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

	}

	public void ClickonTask() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();


	}

	public void Execution() throws InterruptedException {

		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("Queen4");
		driver.findElement(By.xpath("(//div[text()='Description'])[5]/../div/div/div/div/textarea"))
		.sendKeys("hello there.. Soon you are going to created by clicking on create");

		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		String title = driver.findElement(By.xpath("//div[@title='Queen4']")).getText();
		String Expectedresult = "Queen4";
		if (title.equals(Expectedresult)) {
			System.out.println("New customer has been created successfully created");
		} else {
			System.out.println("customer has not been created");
		}

	}

	public void Logout() {
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

	public void closeBrowser()
	{
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {

		Customised_process Cprocess = new Customised_process();
		Cprocess.LaunchBrowser();
		Cprocess.Login();
		Cprocess.ClickonTask();
		Cprocess.Execution();
		Cprocess.Logout();
		Cprocess.closeBrowser();
	}

}
