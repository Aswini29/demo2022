package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframedemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSofware02112021\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement frame1=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frame1);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
		
		driver.switchTo().defaultContent();
		
		//iframe in frame
		
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Webdriver");
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Single Iframe']")).click();
	}

}
