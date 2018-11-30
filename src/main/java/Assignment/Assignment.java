package Assignment;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class Assignment 
{

	@Test
	
	public void testSearch()
	{
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
		
		//Login
		driver.findElement(By.name("uid")).sendKeys("mngr155951");
		driver.findElement(By.name("password")).sendKeys("rUgYpEz");
		driver.findElement(By.name("btnLogin")).click();
		
		//Click on the New Account 
		driver.findElement(By.linkText("New Account")).click();
	
		//Enter the details for the New Account
		driver.findElement(By.name("cusid")).sendKeys("41734");
		Select Accounttype = new Select(driver.findElement(By.name("selaccount")));
		Accounttype.selectByVisibleText("Savings");
		Accounttype.selectByIndex(1);
		
		driver.findElement(By.name("inideposit")).sendKeys("10000");
		driver.findElement(By.name("button2")).click();

		
		
		//driver.close();
		//driver.quit();
	}
}
