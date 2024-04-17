package sampleproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserInitialization {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Vidhya\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com");
	
	WebElement ele =driver.findElement(By.name("q"));
	ele.sendKeys("selenium");
	ele.clear();
	String val =ele.getAttribute("id");
	System.out.println(val);
	
}
}
