package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCases {
	@Test 
    public void openBrowser() {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://prisha-enterprises.in/register.php");
        driver.manage().window().maximize();
        //driver.findElement(By.cssSelector("#mainNav > div > a:nth-child(2) > i")).click();
        //driver.findElement(By.cssSelector("body > main > section > div > div > p > a")).click();
        driver.findElement(By.name("name")).sendKeys("James");
        driver.findElement(By.name("email")).sendKeys("james@test.com");
        driver.findElement(By.name("phone")).sendKeys("9412151510");
        driver.findElement(By.name("password")).sendKeys("Password");
        driver.findElement(By.name("confirm_password")).sendKeys("Password");
        driver.findElement(By.cssSelector("body > main > section > div > div > form > button")).click();
        driver.quit();    
      
    }
	
	@Test 
    public void openBrowser1() {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://prisha-enterprises.in/register.php");
        driver.manage().window().maximize();
        //driver.findElement(By.cssSelector("#mainNav > div > a:nth-child(2) > i")).click();
        //driver.findElement(By.cssSelector("body > main > section > div > div > p > a")).click();
        driver.findElement(By.name("name")).sendKeys("56789");
        driver.findElement(By.name("email")).sendKeys("jamestest.com");
        driver.findElement(By.name("phone")).sendKeys("abcdefg");
        driver.findElement(By.name("password")).sendKeys("Pa");
        driver.findElement(By.name("confirm_password")).sendKeys("P");
        driver.findElement(By.cssSelector("body > main > section > div > div > form > button")).click();
        driver.quit();
	}
	
	@Test 
    public void openBrowser2() {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://prisha-enterprises.in/register.php");
        driver.manage().window().maximize();
        //driver.findElement(By.cssSelector("#mainNav > div > a:nth-child(2) > i")).click();
        //driver.findElement(By.cssSelector("body > main > section > div > div > p > a")).click();
        driver.findElement(By.name("name")).sendKeys("");
        driver.findElement(By.name("email")).sendKeys("");
        driver.findElement(By.name("phone")).sendKeys("");
        driver.findElement(By.name("password")).sendKeys("");
        driver.findElement(By.name("confirm_password")).sendKeys("");
        driver.findElement(By.cssSelector("body > main > section > div > div > form > button")).click();
        driver.quit();
	}

}
