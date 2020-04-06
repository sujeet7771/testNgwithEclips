package FirstTestNGProject;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assert {

	@BeforeTest
	public void openBrowser() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void closeBrowser() {
		System.out.println("after Test");
	}
	@Test
	public void testB() {
		System.out.println(" TestB");
	}

}
