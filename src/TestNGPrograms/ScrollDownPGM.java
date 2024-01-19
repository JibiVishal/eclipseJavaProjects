package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollDownPGM {
	ChromeDriver driver;
	@BeforeTest
	public void browseropen() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@BeforeMethod
	public void urlopen() {
		
		driver.get("https://www.amazon.in/");
		
	}
	@Test
	public void test1() {
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1500)","");
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[6]/ul/li[2]/a")));
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[6]/ul/li[2]/a")).click();
	}
}