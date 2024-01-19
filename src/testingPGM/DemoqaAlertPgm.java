package testingPGM;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoqaAlertPgm {
	ChromeDriver driver;


	@Before
	public void browseropen() {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
	}
		
	@Test
	public void alerthandle1() {
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		Alert a1=driver.switchTo().alert();
		String actualtext1=a1.getText();
		if(actualtext1.equalsIgnoreCase("You clicked a button")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		a1.accept();
		
	}
	@Test
	public void alerthandle2() {
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Alert a2=driver.switchTo().alert();
		String actualtext2=a2.getText();
		if(actualtext2.equalsIgnoreCase("Do you confirm action?")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		a2.accept();	}
}
