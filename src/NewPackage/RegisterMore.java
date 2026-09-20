package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterMore {
	public void openBrowser() {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prisha-enterprises.in/index.php");
        
        driver.findElement(By.cssSelector("#mainNav > div > a:nth-child(2) > i")).click();
        driver.findElement(By.name("email")).sendKeys("jack@test.com");
        driver.findElement(By.name("password")).sendKeys("Password1");
        driver.findElement(By.cssSelector("body > main > section > div > div > form > button")).click();
		
    
        //driver.findElement(By.cssSelector("#mainNav > ul > li:nth-child(2) > a")).click();
        //driver.findElement(By.cssSelector("driver.findElement(By.cssSelector(\"#mainNav > ul > li:nth-child(2) > a\")).click();")).click();
        //driver.findElement(By.cssSelector("body > main > section.section-pad > div > div > div.col-lg-9 > div.row.g-3 > div:nth-child(5) > div > div.body > div.product-actions > button.btn.btn-outline-success")).click();
        //driver.findElement(By.cssSelector("#mainNav > div > a.icon-btn.cart-btn > i")).click();
        //driver.findElement(By.cssSelector("#cartPage > div > div.col-lg-4 > div > a")).click();
        //driver.findElement(By.name("address")).sendKeys("211 MG Road");
        //driver.findElement(By.name("city")).sendKeys("Dehradun");
        //driver.findElement(By.name("state")).sendKeys("Uttrakhand");
       //driver.findElement(By.name("pincode")).sendKeys("248001");
        //driver.findElement(By.cssSelector("body > main > section.section-pad > div > form > div.col-lg-5 > div > button")).click();
        
	}

}
