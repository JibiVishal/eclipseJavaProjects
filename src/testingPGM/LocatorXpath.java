package testingPGM;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorXpath {
	EdgeDriver driver;
	@Before
	public void browseropen() {
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void testtitle() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abcdef");
		driver.findElement(By.xpath("//button[@name='login']")).click();
}
}