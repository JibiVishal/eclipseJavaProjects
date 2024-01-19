package pagePkg_DD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pageclass {
	WebDriver driver;
	By fbemail=By.id("email");
	By fbpassword=By.id("pass");
	By fblogin=By.name("login");
	public Pageclass(WebDriver driver) {
		this.driver=driver;
	}
	public void setvalues(String email,String pass) {
		driver.findElement(fbemail).clear();
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpassword).clear();
		driver.findElement(fbpassword).sendKeys(pass);
	}
	public void login() {
		driver.findElement(fblogin).click();
	}

}
