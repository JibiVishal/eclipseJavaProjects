package testPkg_DD;

import org.testng.annotations.Test;

import basePkg_DD.Baseclass;
import pagePkg_DD.Pageclass;
import utilityPkg_DD.Utilityclass;

public class Testclass extends Baseclass {
	@Test
	public void test1() {
		
	
	Pageclass p1=new Pageclass(driver);
	//reading the data from excel file by the specifiedpth
	String xl="G:\\Book1.xlsx";
	String sheet="Sheet1";
	int rowCount=Utilityclass.getRowCount(xl, sheet);
	System.out.println(rowCount);
	for(int i=1;i<rowCount;i++) {
		String UserName=Utilityclass.getCellValue(xl, sheet, i, 0);
		System.out.println("username--"+UserName);
		String Pwd=Utilityclass.getCellValue(xl, sheet, i, 1);
		System.out.println("password---"+Pwd);
		//passing username and password as parameter
		//Submitting the data by clicking on login button
		p1.setvalues(UserName, Pwd);
		p1.login();
		
	}
}
}