package TestNGPrograms;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon2Sangeetha {
	ChromeDriver driver;
	@BeforeTest
	public void urlopen()
	{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	}
	@Test
	public void testing()

	{
		driver.manage().window().maximize();
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles",Keys.ENTER);
	
	String content=driver.getTitle();
	//System.out.println(content);
	if(content.equals("Amazon.in : mobiles"))
	{
	System.out.println("Pass");
	}
	else
	{
	System.out.println("Fail");
	}




	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
	Set<String> allwindow = driver.getWindowHandles();
	for(String handle:allwindow) {
		if(!handle.equalsIgnoreCase(parentWindow)) {
			driver.switchTo().window(handle);
			
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
	}

	}
	}


	
}
