package seleniumprograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandledemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSofware02112021\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		System.out.println("The title of main window is: "+driver.getTitle());
		
		WebElement tabwindow=driver.findElement(By.xpath("//a//button[@class='btn btn-info'][contains(text(),'click')]"));
		tabwindow.click();

		Set<String>windowid=driver.getWindowHandles();
		
		Iterator<String>iter= windowid.iterator();
		
		String mainwindow=iter.next();
		
		String childwindow=iter.next();
		
		driver.switchTo().window(childwindow);
		
		System.out.println("The title of child window is: "+driver.getTitle());
		
		//driver.close();
		
		driver.switchTo().window(mainwindow);
		
		System.out.println("The title of main window is: "+driver.getTitle());
		
		driver.quit();
	}

}
