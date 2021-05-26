package ActionFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Persistent\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://mrbool.com/");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Articles']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	
}
