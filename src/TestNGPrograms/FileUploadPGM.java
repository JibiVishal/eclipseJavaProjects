package TestNGPrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadPGM {
	ChromeDriver driver;
	@BeforeTest
	public void browseropen() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@BeforeMethod
	public void urlopen() {
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
	}
@Test
public void test1() throws AWTException {
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	fileUpload("G:\\my visa.pdf");
}
public void fileUpload(String p) throws AWTException {
	//to copy path to clipboard
	StringSelection strselection=new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection,null);
	//to paste into systemwindow
	Robot robot=new Robot();
	robot.delay(3000);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
}
}
