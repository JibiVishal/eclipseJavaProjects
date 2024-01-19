package testingPGM;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrrenshotFullPage {
	ChromeDriver driver;
	 @Before
	 public void browseropen() {
		 driver=new ChromeDriver();
		 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 }
	 @Test
	 public void test() throws IOException {
		 driver.manage().window().maximize();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("F:\\Screenshot1.png"));
		 
		
		
	 }
}
