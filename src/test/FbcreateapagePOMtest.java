package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FbcreateapagePOM;

public class FbcreateapagePOMtest {
WebDriver driver;
@BeforeTest
public void browseropen() {
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlopen() {
	driver.get("https://www.facebook.com/");
}
@Test
public void test1() {
	FbcreateapagePOM ob=new FbcreateapagePOM(driver);
	ob.click();
}
}
