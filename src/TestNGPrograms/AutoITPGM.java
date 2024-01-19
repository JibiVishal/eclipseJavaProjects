package TestNGPrograms;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoITPGM {
	ChromeDriver driver;
	@BeforeTest
	public void browseropen() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@BeforeMethod
	public void urlopen() {
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
	}
@Test
public void test1() throws IOException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	Runtime.getRuntime().exec("G:\\T1.exe");
}
}
