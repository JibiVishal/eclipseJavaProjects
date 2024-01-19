package testingPGM;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonXpath {
	EdgeDriver driver;
	@Before
	public void browseropen() {
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		
	}
	@Test
	public void testtitle() {
		driver.findElement(By.xpath("//*[@id='nav-xshop' ]/a[6]")).click();
}
}
