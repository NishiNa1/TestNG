package ParrellTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterNegative {
	
	public ChromeDriver driver;
	String url = "https://prisha-enterprises.in/index.php";
	String url1 = "https://prisha-enterprises.in/register.php";
	
	@BeforeMethod
	
	public void openBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get(url);  
	}
        
	@Test 
    public void RegisterNegative1() {
		driver.get(url1);
        driver.findElement(By.name("name")).sendKeys("1234");
        driver.findElement(By.name("email")).sendKeys("johntest.com");
        driver.findElement(By.name("phone")).sendKeys("abcdfgehjy");
        driver.findElement(By.name("password")).sendKeys("Pa");
        driver.findElement(By.name("confirm_password")).sendKeys("Pa");
        driver.findElement(By.cssSelector("body > main > section > div > div > form > button")).click();			
	}
	        
	        @AfterMethod
		    public void Close() {
				
				driver.close();
	        
        
	}

}
