package testingPGM;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkValidation {
	ChromeDriver driver;
String baseurl="https://www.google.com";
@Before
public void browseropen() {
	driver=new ChromeDriver();
}
@Test
public void test() throws IOException {
	driver.get(baseurl);
	URL ob=new URL(baseurl);
	HttpURLConnection con=(HttpURLConnection)ob.openConnection();
	con.connect();
	if(con.getResponseCode()==200) {
		System.out.println("Valid---"+baseurl);
	}
	else {
		System.out.println("Invalid---"+baseurl);
	}


	
}
}
