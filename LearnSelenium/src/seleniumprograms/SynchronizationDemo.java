package seleniumprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSofware02112021\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),'Welcome ABC')]")).click();
		
		WebDriverWait mywait=new WebDriverWait(driver, 10);
		//mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Logout')]")));
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Logout')]")));
		
		driver.findElement(By.xpath("//*[contains(text(),'Logout')]")).click();
		driver.close();

	}

}
