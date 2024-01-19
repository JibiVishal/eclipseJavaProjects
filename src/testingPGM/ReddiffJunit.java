package testingPGM;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReddiffJunit {
	ChromeDriver driver;
	 @Before
	 public void browseropen() {
		 driver=new ChromeDriver();
		 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 }
	 @Test
	 public void test() {
		 WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		 Select sc=new Select(dayelement);
		 sc.selectByValue("01");
		 WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		 Select mc=new Select(monthelement);
		 mc.selectByIndex(01);
		 WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		 Select yc=new Select(yearelement);
		 yc.selectByVisibleText("2000");
		 List<WebElement> di = sc.getOptions();
		 System.out.println("day count "+di.size());
		 List<WebElement> mi = mc.getOptions();
		 System.out.println("month count "+mi.size());
		 List<WebElement> yi = yc.getOptions();
		 System.out.println("year count "+yi.size());
		 
	 }
}