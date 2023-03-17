package dropdownHandling;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import javax.swing.JList.DropLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_handlingUsingSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://selenium//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.opencart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']")).click();
		WebElement element =driver.findElement(By.xpath("//select[@id='input-country']"));
		Select s=new Select(element);
		s.selectByIndex(31);
	
		//s.selectByValue("13");
		//s.selectByVisibleText("Dominica");
		
		//This is the first method we can print all the list of elements present in the dropdown/list
		List<WebElement> list=driver.findElements(By.xpath("//select[@id='input-country']/option"));
		/*for(WebElement countrylist:list ) {
			System.out.println(countrylist.getText());
		}*/
		//This is the second method to print all the elements
		Iterator<WebElement> Iter=list.iterator();
		while(Iter.hasNext()) {
			WebElement elements=Iter.next();
			 System.out.println(elements) ;                     ;
		}

	

	}	

}
