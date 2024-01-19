package TestNGPrograms;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandlePGM {
	WebDriver driver;
	@BeforeTest
	public void browseropen() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@BeforeMethod
	public void urlopen() {
		
		driver.get("https://demo.guru99.com/popup.php");
		
	}
	@Test
	public void test1() {
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allwindow = driver.getWindowHandles();
		for(String handle:allwindow) {
			if(!handle.equalsIgnoreCase(parentwindow)) {
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abcde@gmail.com");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				driver.close();
			}
			driver.switchTo().window(parentwindow);
		}
		//WebDriver driver1=driver.switchTo().newWindow(WindowType.TAB);
		WebDriver driver1=driver.switchTo().newWindow(WindowType.WINDOW);
		driver1.get("https://www.google.com");
	}
}
