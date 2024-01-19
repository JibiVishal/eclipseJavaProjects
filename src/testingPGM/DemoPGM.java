package testingPGM;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPGM {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle="Google";
		if(actualtitle.equalsIgnoreCase(expectedtitle)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		driver.close();
}
}