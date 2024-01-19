package basePkg_DD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public WebDriver driver;
	
	@BeforeTest
	public void browseropen() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlopen() {
		driver.get("https://www.facebook.com/");
	}
}
