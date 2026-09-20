package ParrellTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterBlank {
	
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
    public void RegisterBlank1() {
		
		driver.get(url1);
        driver.findElement(By.name("name")).sendKeys("");
        driver.findElement(By.name("email")).sendKeys("");
        driver.findElement(By.name("phone")).sendKeys("");
        driver.findElement(By.name("password")).sendKeys("");
        driver.findElement(By.name("confirm_password")).sendKeys("");
        driver.findElement(By.cssSelector("body > main > section > div > div > form > button")).click();			
	}
	        
	        @AfterMethod
		    public void Close() {
				
				driver.close();
	        
        
	}

}
