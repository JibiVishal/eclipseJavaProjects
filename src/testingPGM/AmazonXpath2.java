package testingPGM;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonXpath2 {
ChromeDriver driver;
@Before
public void browseropen() {
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	
}
@Test
public void test() throws InterruptedException {
	
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id=\'twotabsearchtextbox\']")).sendKeys("Mobiles",Keys.ENTER);
	driver.findElement(By.xpath("//span[@id=\"nav-cart-count\"]")).click();
	driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("abcdef@gmail.com");
	driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
	driver.findElement(By.xpath("//span[@class=\"hm-icon-label\"]")).click();
}

}