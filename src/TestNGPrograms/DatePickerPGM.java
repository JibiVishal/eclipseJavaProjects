package TestNGPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePickerPGM {
WebDriver driver;
@BeforeTest
public void browseropen() {
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlopen() {
	driver.get("https://www.trivago.com/");
}
@Test
public void test1() {
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[1]/fieldset/button[1]")).click();
	while(true) {
		WebElement monthelement = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));
		String month = monthelement.getText();
		if(month.equalsIgnoreCase("January 2024")) {
			System.out.println(month);break;
		}
		else {
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]")).click();
		}
	}
	
	List<WebElement> alldays = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
	for(WebElement dayselement:alldays) {
		//String day=dayselement.getAttribute("data-day");
		String day=dayselement.getText();
		//System.out.println(day);
		if(day.equals("24")) {
			System.out.println(day);
			dayselement.click();
			System.out.println("Date selected");
			break;
		}
	
	}
	driver.close();
	
	
	
}	
	
}

