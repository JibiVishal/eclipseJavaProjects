package testingPGM;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReddiffCheckedLogo {
	ChromeDriver driver;
	 @Before
	 public void browseropen() {
		 driver=new ChromeDriver();
		 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 }
	 @Test
	 public void test() {
		WebElement logoelement= driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		 Boolean logo=logoelement.isDisplayed();
		 if(logo) {
			 System.out.println("Logo is present");
			 }
		 else {
			 System.out.println("Logo is absent");
		 }
		 WebElement checkboxelement= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		 Boolean checkbox=checkboxelement.isSelected();
		 if(checkbox) {
		 System.out.println("Selected");
		 }
		 else {
			 System.out.println("Not selected");
		 }
		 WebElement radioelement= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		 Boolean radio=radioelement.isSelected();
		 if(radio) {
		 System.out.println("Selected");
		 }
		 else {
			 System.out.println("Not selected");
		 }
}
}