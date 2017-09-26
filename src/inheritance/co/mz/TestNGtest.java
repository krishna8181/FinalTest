package inheritance.co.mz;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGtest {

	public static WebDriver driver;
	public static String type1 = "Business";
	public static String i = "2";
	public static String k = "2";
	
	
	@BeforeClass
	public void login()
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IJ\\Documents\\Selenium\\Software\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.absa.co.za/personal/");

	}
		
	@Test (enabled = true)
	public void selecta()
	{
	Assert.assertEquals("https://www.absa.co.za/personal/", driver.getCurrentUrl());
	}
	
	@Test(dependsOnMethods = {"selecta"},alwaysRun = true)
	public void selectloginbusiness() throws Exception
	{
		driver.findElement(By.linkText("Logon")).click();
		//click the first drop down list box
		driver.findElement(By.xpath("//html/body/div[4]/div[1]/div/div/div/div[1]/div/div/div[6]/div/div/div/div/div[2]/div[1]/div/span")).click();
		
		Thread.sleep(1000);
		
		//select option in the drop down list box
		driver.findElement(By.xpath("//html/body/div[4]/div[1]/div/div/div/div[1]/div/div/div[6]/div/div/div/div/div[2]/div[1]/div/ul/li["+i+"]")).click();

		Thread.sleep(1000);
        //click the drop down list box
		driver.findElement(By.xpath("//html/body/div[4]/div[1]/div/div/div/div[1]/div/div/div[6]/div/div/div/div/div[2]/div[2]/div/span")).click();
		
		//select the option in drop down list box
		Thread.sleep(1000);
		driver.findElement(By.xpath("//html/body/div[4]/div[1]/div/div/div/div[1]/div/div/div[6]/div/div/div/div/div[2]/div[2]/div/ul["+i+"]/li["+k+"]")).click();
	
	
			
	}
	
	@Test (priority = 3, enabled = true)
	public void absalogindetails() throws Exception
	
	{
	// how to move between one window to other after selecting a link in the parent window
		String parentwindow =driver.getWindowHandle();
	// select logon button
			driver.findElement(By.className("action-login")).click();
	// the below code is move to the new window that is available after selecting link in the parent window
			for (String childwindow : driver.getWindowHandles())
			{
				driver.switchTo().window(childwindow);	
			
			}
	// the below code is move to from parent frame to child frame
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
	
			driver.switchTo().frame("MenuBody").switchTo().frame("info");
		String g=	driver.findElement(By.xpath("//html/body/div[1]/table/tbody/tr/td/table[1]/tbody/tr/td/h3/span")).getText();
		System.out.println(g);
		String k = driver.getCurrentUrl();
		System.out.println(k);
		driver.findElement(By.xpath("//html/body/div[1]/table/tbody/tr/td/table[2]/tbody/tr/td/form/table/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[2]/p/span/input")).sendKeys("kk");
		Thread.sleep(2000);
	// the below code is to close the new window 
		driver.close();
		driver.switchTo().window(parentwindow);
		String a = driver.getCurrentUrl();
		System.out.println(a);		
			

	}
		
	
	@AfterClass(enabled = false)
	public void logout()
	{
		driver.quit();
	}

}
