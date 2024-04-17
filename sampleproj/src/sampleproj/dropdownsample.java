package sampleproj;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdownsample {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Vidhya\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		//WebElement ele = driver.findElement(By.xpath("//a[@id='menu-button']"));
		//ele.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele1 = driver.findElement(By.xpath("//*[contains(@class,'server')]"));
		WebElement ele2 =driver.findElement(By.xpath("//*[@id='menuform:m_dropdown']/a/span"));
		
		Actions a = new Actions(driver);
		a.moveToElement(ele1).click().build().perform();
		Thread.sleep(1000);
		a.moveToElement(ele2).click().build().perform();
		Thread.sleep(1000);
		//driver.close();
	}
}
