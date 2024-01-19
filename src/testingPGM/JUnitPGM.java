package testingPGM;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitPGM {
	@Before
	public void browseropen() {
		System.out.println("browseropen");
	}
	@Test
	public void test() {
		System.out.println("test activity");
	}
	@After
	public void broserclose() {
		System.out.println("browserclose");
	}
}
