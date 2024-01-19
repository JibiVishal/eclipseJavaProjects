package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DirectFileUpload {
	ChromeDriver driver;
	@BeforeTest
	public void browseropen() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@BeforeMethod
	public void urlopen() {
		
		driver.get("https://demo.guru99.com/test/upload/");
		
	}
@Test
public void test1() {
	driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("G:\\my visa.pdf");
	driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}
}
