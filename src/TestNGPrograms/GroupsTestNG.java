package TestNGPrograms;

import org.testng.annotations.Test;

public class GroupsTestNG {
@Test(groups= {"Sanity"})
public void main1() {
	System.out.println("main1");
}
@Test(groups= {"Sanity","Smoke"})
public void main2() {
	System.out.println("main2");
}
@Test(groups= {"Regression"})
public void main3() {
	System.out.println("main3");
}
@Test(groups= {"Regression","Sanity"})
public void main4() {
	System.out.println("main4");
}
@Test
public void main5() {
	System.out.println("main5");
}
}
