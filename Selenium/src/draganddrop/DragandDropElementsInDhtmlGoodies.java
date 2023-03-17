package draganddrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropElementsInDhtmlGoodies {

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver","D://selenium//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		Actions act= new Actions(driver);
		WebElement dragStockholm=driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
		Thread.sleep(3000);
		WebElement dropStockholm=driver.findElement(By.xpath("(//div[text()='Sweden'])"));
		Thread.sleep(4000);
		act.dragAndDrop(dragStockholm, dropStockholm);
		
		WebElement dragSeoul=driver.findElement(By.xpath("(//div[text()='Seoul'])[2]"));
		WebElement dropSeoul=driver.findElement(By.xpath("//div[text()='South Korea']"));
		act.dragAndDrop(dragSeoul, dropSeoul);
		
		WebElement dragOslo=driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
		WebElement dropOslo=driver.findElement(By.xpath("//div[text()='Norway']"));
		act.dragAndDrop(dragOslo, dropOslo);
		
		WebElement dragRome=driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
		WebElement dropRome=driver.findElement(By.xpath("//div[text()='Italy']"));
		act.dragAndDrop(dragRome, dropRome);
		
		WebElement dragCopenhagen=driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]"));
		WebElement dropCopenhagen=driver.findElement(By.xpath("//div[text()='Denmark']"));
		act.dragAndDrop(dragCopenhagen, dropCopenhagen);
		
		WebElement dragWashington =driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
		WebElement dropWashington=driver.findElement(By.xpath("//div[text()='United States']"));
		act.dragAndDrop(dragWashington, dropWashington);
		
		WebElement dragMadrid=driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
		WebElement dropMadrid=driver.findElement(By.xpath("//div[text()='Spain']"));
		act.dragAndDrop(dragMadrid, dropMadrid);
		
		act.perform();
		
		driver.quit();
		
		

		
	}

}

