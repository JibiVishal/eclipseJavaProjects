package testingPGM;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayJunit {
 ChromeDriver driver;
 @Before
 public void browseropen() {
	 driver=new ChromeDriver();
	 driver.get("https://www.ebay.com/");
 }
 @Test
 public void test() {
	 
	 driver.manage().window().maximize();
	 String actualtitle=driver.getTitle();
		
		String expectedtitle="Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";
		if(actualtitle.equalsIgnoreCase(expectedtitle)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	 driver.findElement(By.xpath("//button[@id=\"gh-shop-a\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/ul[1]/li[4]/a")).click();
	 driver.findElement(By.xpath("//*[contains(text(),'Shop by Category')]"));
	 driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/span[1]/a/div[2]")).click();
	 driver.findElement(By.xpath("//*[@id=\"gh-minicart-hover\"]/div/a[1]")).click();
	 driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div/div/div/div[3]/a[2]")).click();
	 driver.findElement(By.xpath("//input[@id=\"gh-ac\"]")).sendKeys("books",Keys.ENTER);
 }
 
}
