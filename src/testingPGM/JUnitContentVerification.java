package testingPGM;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitContentVerification {
ChromeDriver driver;
@Before
public void browseropen() {
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	}
@Test
public void test() {
	String content=driver.getPageSource();
	if(content.contains("Gmail")) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
}
@After
public void browserpen() {
	driver.quit();
}
}
