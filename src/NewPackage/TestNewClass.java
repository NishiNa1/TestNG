package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNewClass {
	
		public ChromeDriver driver;
		String url = "https://prisha-enterprises.in/index.php";
		String url1 = "https://prisha-enterprises.in/register.php";
		
		@BeforeMethod
		
		public void openBrowser() {

			driver = new ChromeDriver();
			driver.manage().window().maximize();
	        driver.get(url);  
	        
		}
		@Test(priority = 4) 
	    public void Login() {
		
			driver.findElement(By.cssSelector("#mainNav > div > a:nth-child(2)")).click();
	        driver.findElement(By.name("email")).sendKeys("jack@test.com");
	        driver.findElement(By.name("password")).sendKeys("Password1");
	        driver.findElement(By.cssSelector("body > main > section > div > div > form > button")).click();
	        /*driver.findElement(By.cssSelector("#mainNav > ul > li:nth-child(2) > a")).click();
	        driver.findElement(By.cssSelector("driver.findElement(By.cssSelector(\"#mainNav > ul > li:nth-child(2) > a\")).click();")).click();
	        driver.findElement(By.cssSelector("body > main > section.section-pad > div > div > div.col-lg-9 > div.row.g-3 > div:nth-child(5) > div > div.body > div.product-actions > button.btn.btn-outline-success")).click();
	        driver.findElement(By.cssSelector("#mainNav > div > a.icon-btn.cart-btn > i")).click();
	        driver.findElement(By.cssSelector("#cartPage > div > div.col-lg-4 > div > a")).click();
	        driver.findElement(By.name("address")).sendKeys("211 MG Road");
	        driver.findElement(By.name("city")).sendKeys("Dehradun");
	        driver.findElement(By.name("state")).sendKeys("Uttrakhand");
	        driver.findElement(By.name("pincode")).sendKeys("248001");
	        driver.findElement(By.cssSelector("body > main > section.section-pad > div > form > div.col-lg-5 > div > button")).click();*/
	        
		}
			
		@Test (priority = 2)
	    public void Register() {
			driver.get(url1);
	        driver.findElement(By.name("name")).sendKeys("Jack");
	        driver.findElement(By.name("email")).sendKeys("jack@test.com");
	        driver.findElement(By.name("phone")).sendKeys("9412151512");
	        driver.findElement(By.name("password")).sendKeys("Password1");
	        driver.findElement(By.name("confirm_password")).sendKeys("Password1");
	        driver.findElement(By.cssSelector("body > main > section > div > div > form > button")).click();			
		}
		
		@Test (priority = 0)
	    public void RegisterNegative() {
			driver.get(url1);
	        driver.findElement(By.name("name")).sendKeys("1234");
	        driver.findElement(By.name("email")).sendKeys("johntest.com");
	        driver.findElement(By.name("phone")).sendKeys("abcdfgehjy");
	        driver.findElement(By.name("password")).sendKeys("Pa");
	        driver.findElement(By.name("confirm_password")).sendKeys("Pa");
	        driver.findElement(By.cssSelector("body > main > section > div > div > form > button")).click();			
		}
		
		@Test (priority = 1)
	    public void RegisterBlank() {
			driver.get(url1);
	        driver.findElement(By.name("name")).sendKeys("");
	        driver.findElement(By.name("email")).sendKeys("");
	        driver.findElement(By.name("phone")).sendKeys("");
	        driver.findElement(By.name("password")).sendKeys("");
	        driver.findElement(By.name("confirm_password")).sendKeys("");
	        driver.findElement(By.cssSelector("body > main > section > div > div > form > button")).click();			
		}
		@Test (priority = 3)
	    public void ForgetPassword() {
			driver.get(url);
			driver.findElement(By.cssSelector("#mainNav > div > a:nth-child(2)")).click();				      
	        driver.findElement(By.cssSelector("body > main > section > div > div > form > div:nth-child(3) > div.d-flex.justify-content-between.align-items-center.mb-1 > a")).click();
	        driver.findElement(By.name("email")).sendKeys("johntest.com");
	        driver.findElement(By.cssSelector("body > main > section > div > div > form > button")).click();	
		}
		
		
		
		
		@AfterMethod
	    public void Close() {
			
			driver.close();
		}

}
