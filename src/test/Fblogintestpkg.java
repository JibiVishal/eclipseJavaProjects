package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Fbloginpagepkg;

public class Fblogintestpkg {
	WebDriver driver;
@BeforeTest
public void browseropen() {
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlopen() {
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
}
@Test
public void test1() {
	Fbloginpagepkg ob=new Fbloginpagepkg(driver);
	ob.setvalues("abcdefgh@gmail.com","Abcdghfhgf@12345");
	ob.login();
}
}
