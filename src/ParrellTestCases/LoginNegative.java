package ParrellTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginNegative {
	
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
    public void Login() {
	
		driver.findElement(By.cssSelector("#mainNav > div > a:nth-child(2)")).click();
        driver.findElement(By.name("email")).sendKeys("abcde");
        driver.findElement(By.name("password")).sendKeys("1234");
        driver.findElement(By.cssSelector("body > main > section > div > div > form > button")).click();
	        
        }
	        
	        @AfterMethod
		    public void Close() {
				
				driver.close();
	        
        
	}

}
