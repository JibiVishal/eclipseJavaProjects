package testingPGM;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {
	ChromeDriver driver;


	@Before
	public void browseropen() {
		driver=new ChromeDriver();
		driver.get("file:///F:/documents/alert.html");
	}
		
	@Test
	public void alerthandle() {
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		//driver.switchTo().alert().accept();
		//verify text in the alert box
		Alert a=driver.switchTo().alert();
		String actualtext=a.getText();
		if(actualtext.equals("hello!I am an alert box!!")) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Reena");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Mathew");
		
}
}