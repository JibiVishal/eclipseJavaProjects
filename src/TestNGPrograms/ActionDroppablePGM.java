package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionDroppablePGM {
ChromeDriver driver;
@BeforeMethod
public void urlopen() {
	driver=new ChromeDriver();
	driver.get("https://demoqa.com/droppable");
}
@Test
public void test1() {
	driver.manage().window().maximize();
	WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	Actions act=new Actions(driver);
	act.dragAndDrop(drag, drop);
	act.perform();
	String text=drop.getText();
	//System.out.println(text);
	if(text.equals("Dropped!")) {
		System.out.println("Pass");
	}
	else {
	System.out.println("fail");
	}
	
}
}
