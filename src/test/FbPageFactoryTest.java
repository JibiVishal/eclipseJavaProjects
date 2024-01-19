package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FbPageFactoryPGM;

public class FbPageFactoryTest {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url() {
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test1() {
		FbPageFactoryPGM ob=new FbPageFactoryPGM(driver);
		ob.setvalues("gfgfgfhg@gmail.com","ffgfgffh");
		ob.login();
	}
}
