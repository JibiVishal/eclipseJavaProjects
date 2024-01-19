package TestNGPrograms;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Notification {
	WebDriver driver;
	@BeforeTest
	public void browseropen() {
		ChromeOptions option=new ChromeOptions();
		//option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
	}
	@Test
	public void urlopen() {
		
		driver.get("https://www.justdial.com/");
		
	}
	
}
