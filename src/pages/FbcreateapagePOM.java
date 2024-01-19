package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbcreateapagePOM {
WebDriver driver;
By fbpage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
By fbselect=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[2]/div/div[1]/div[2]/button/div/div");
public FbcreateapagePOM(WebDriver driver) {
	this.driver=driver;
}
public void click() {
	driver.findElement(fbpage).click();
	driver.findElement(fbselect).click();
}



}
