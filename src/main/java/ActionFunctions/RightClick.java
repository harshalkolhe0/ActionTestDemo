package ActionFunctions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Persistent\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions action=new Actions(driver);
		WebElement rightclick=driver.findElement(By.cssSelector(".context-menu-one"));
		action.contextClick(rightclick).build().perform();
		Thread.sleep(3000);
		WebElement copy=driver.findElement(By.xpath("//span[text()='Copy']"));
		System.out.println(copy.getText());
		copy.click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		driver.quit();
	}
	
}
