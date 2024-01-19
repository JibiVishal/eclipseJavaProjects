package testingPGM;

import org.openqa.selenium.chrome.ChromeDriver;

public class ContentVerification {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String content=driver.getPageSource();
		if(content.contains("Gmail")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}

	}

}
