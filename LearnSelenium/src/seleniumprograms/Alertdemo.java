package seleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSofware02112021\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
		
		Alert altr=driver.switchTo().alert();
		
		String alertmessage=driver.switchTo().alert().getText();
		
		System.out.println(alertmessage);
		
		Thread.sleep(3000);
		
		altr.accept();
		
		
	}

}
