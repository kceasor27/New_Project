package sampleproj;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Vidhya\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://toolsqa.com/");
		driver.manage().window().maximize();
		
		WebElement ele =driver.findElement(By.xpath("//a[@class='btn btn-primary-shadow btn-block']"));
		// Get xy position 
		
		//Point point = ele.getLocation();
		int xval=ele.getLocation().getX();
		int yval=ele.getLocation().getY();
		System.out.println("xval  "+xval+"yval  :"+yval);
		
		
		//Get button color
		String buttoncolor=ele.getCssValue("background-color");
		System.out.println("Button color  "+buttoncolor);
		
		//Get button size
		int buttonheight = ele.getSize().getHeight();
		int buttonwidth = ele.getSize().getWidth();
		System.out.println("Button Height  "+buttonheight+"Button Width  :"+buttonwidth);
		
		//click
		ele.click();
		
	}

}
