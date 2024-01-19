package TestNGPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RihtDoubleActionPGM {
ChromeDriver driver;
@BeforeTest
public void urlopen() {
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
}
@Test
public void test1() {
	WebElement rg=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	WebElement ed=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
	Actions act=new Actions(driver);
	act.contextClick(rg);
	act.click(ed);
	act.perform();
	Alert al=driver.switchTo().alert();
	String t=al.getText();
	if(t.equals("clicked: edit")) {
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	al.accept();
}
@Test
public void test2() {
	WebElement dou=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	Actions acti=new Actions(driver);
	acti.doubleClick(dou);
	acti.perform();
	Alert alt=driver.switchTo().alert();
	String text=alt.getText();
	if(text.equals("You double clicked me.. Thank You..")) {
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	alt.accept();
}
}
