package testingPGM;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownFacebook {
			ChromeDriver driver;
		 @Before
		 public void browseropen() {
			 driver=new ChromeDriver();
			 driver.get("https://www.facebook.com/r.php/");
		 }
		 @Test
		 public void test() {
			 WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"day\"]"));
			 Select sc=new Select(dayelement);
			 sc.selectByValue("1");
			 WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"month\"]"));
			 Select mc=new Select(monthelement);
			 mc.selectByIndex(1);
			 WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"year\"]"));
			 Select yc=new Select(yearelement);
			 yc.selectByVisibleText("2012");
			 List<WebElement> di = sc.getOptions();
			 System.out.println("day count "+di.size());
			 List<WebElement> mi = mc.getOptions();
			 System.out.println("month count "+mi.size());
			 List<WebElement> yi = yc.getOptions();
			 System.out.println("year count "+yi.size());
			 
		 }
}
