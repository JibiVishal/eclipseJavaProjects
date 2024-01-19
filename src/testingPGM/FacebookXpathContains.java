package testingPGM;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpathContains {
	ChromeDriver driver;
	@Before
	public void browseropen() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void test() {
		driver.findElement(By.xpath("//button[contains(@id,'loginbutton')]")).click();
}
}