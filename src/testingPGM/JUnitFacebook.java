package testingPGM;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.edge.EdgeDriver;


public class JUnitFacebook {
	EdgeDriver driver;
	@Before
	public void browseropen() {
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void testtitle() {
	
		String title=driver.getTitle();
		//System.out.println(title);
		if(title.equalsIgnoreCase("Facebook – log in or sign up")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	
	
		String content=driver.getPageSource();
		//System.out.println(content);
		if(content.contains("Create a Page")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	@After
	public void browserclose() {
		driver.quit();
	}
}
