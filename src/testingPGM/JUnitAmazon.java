package testingPGM;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.edge.EdgeDriver;

public class JUnitAmazon {
	EdgeDriver driver;
	@Before
	public void browseropen() {
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		
	}
	@Test
	public void testtitle() {
	
		String title=driver.getTitle();
		//System.out.println(title);
		if(title.equalsIgnoreCase("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	
	
		String content=driver.getPageSource();
		//System.out.println(content);
		if(content.contains("Mobiles")) {
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


