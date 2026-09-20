package NewPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestClass {
	@BeforeMethod
	
	public void openBrowser() {

		System.out.println("Java");
        
	}
	@Test 
    public void openBrowser2() {
		
		System.out.println("Test");
	}
		

	
	@AfterMethod
    public void openBrowser1() {
		
		System.out.println("After");
	}


}
