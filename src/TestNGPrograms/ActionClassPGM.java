package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionClassPGM {
ChromeDriver driver;
@BeforeMethod
public void urlopen() {
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void test1() {
	WebElement fn=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
	fn.sendKeys("abcd");
	WebElement rd=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
	
	Actions act=new Actions(driver);
	act.keyDown(fn, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	act.keyDown(fn, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	act.keyDown(rd,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	//act.build().perform();
	act.perform();
}
}
