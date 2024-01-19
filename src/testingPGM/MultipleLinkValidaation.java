package testingPGM;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinkValidaation {
ChromeDriver driver;


@Before
public void browseropen() {
	driver=new ChromeDriver();
	}
@Test
public void linkcount() {
	driver.get("https://www.google.com");
	  List<WebElement> li = driver.findElements(By.tagName("a"));
	  for(WebElement lk:li) {
		  String links=lk.getAttribute("href");
		  verify(links);
		  
	  }
}
private void verify(String links) {
	try {
		URL ob=new URL(links);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		con.connect();
		if(con.getResponseCode()==200) {
			System.out.println("Valid---"+links);
		}
		else {
			System.out.println("Invalid---"+links);
		}
	}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
	}
}
