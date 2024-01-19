package TestNGPrograms;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RishiherbalPGM {
	ChromeDriver driver;
	@BeforeTest
	public void browseropen() {
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlopen() {
		
		driver.get("https://rishiherbalindia.linker.store/");
}
	@Test
	public void test1() {
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		 driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("abcdefgh@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Abcd@12345");
		
		 driver.findElement(By.xpath("//*[@id=\"register-model-signin-link\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input")).clear();
		 driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input")).sendKeys("abcdefgh@gmail.com");
		 driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Abcd@12345");
		 driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
		 String actualurl=driver.getCurrentUrl();
			String expectedurl="https://rishiherbalindia.linker.store/";
			if(actualurl.equals(expectedurl)) {
				System.out.println("Logged Successfully");
			}
			else {
				System.out.println("Unsucess");
			}}
			
	@Test
	public void test2() {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Herbal Agro Growth Booster",Keys.ENTER);
		 JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)","");
			WebElement mo=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img"));
			
			Actions act=new Actions(driver);
			act.moveToElement(mo);
			act.perform();
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button")).click();
			
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/h4/a")).click();
			 driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();
			 driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
			 driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
			 driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
			 driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
		 
	}
	}
