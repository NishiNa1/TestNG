package NewPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewClass {
	@Test
    public void openBrowser() {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();

        driver.quit();
        
        
    }
	
	@Test
    public void openBrowser1() {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://prisha-enterprises.in");
        driver.manage().window().maximize();

        driver.quit();
	}

}
