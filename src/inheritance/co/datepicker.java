package inheritance.co;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class datepicker {
public static WebDriver driver;
public static int i;

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IJ\\Documents\\Selenium\\Software\\geckodriver.exe");
		driver= new FirefoxDriver();
	

driver.get("https://www.tripadvisor.co.za/CheapFlightsHome");

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

driver.findElement(By.xpath(".//*[@id='taplc_trip_search_home_flights_0']/div[2]/div/span/div[1]/div/div[1]/div/div[2]/input[2]")).sendKeys("Durban");

driver.findElement(By.xpath(".//*[@id='taplc_trip_search_home_flights_0']/div[2]/div/span/div[1]/div/div[2]/div/div/span[1]")).click();

String date = "4-Oct 2017";
String splitter[] = date.split("-");


String chekinday = splitter[0];
String checkinmonth_year = splitter[1];


selectdate(checkinmonth_year,chekinday);


	}
	
	public static void selectdate(String day, String month_year) throws Exception
	{
	List <WebElement> elements = driver.findElements(By.xpath("//html/body/span/div[3]/div/div[5]/div/span/span[1]"));


	for (int i = 0; i<elements.size();i++)
	{
	System.out.println(elements.get(i).getText());	
	if (elements.get(i).getText().equals(month_year));

	{
		
		List <WebElement> days = driver.findElements(By.xpath("//html/body/span/div[3]/div/div[5]/div/span/span"));
		for(WebElement d: days)
		{
			//System.out.println(d.getText());
			if (d.getText().equals(day))
			{
				d.click();
				return;
			}
		}
		
		
	}
	}

	
			
/*	do 
	{
	driver.findElement(By.xpath("//html/body/span/div[3]/div/div[2]")).click();
	Thread.sleep(2000);
	}

	while (!elements.get(i).getText().equals(month_year));
	selectdate(month_year,day);	*/
	
	driver.findElement(By.xpath("//html/body/span/div[3]/div/div[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//html/body/span/div[3]/div/div[2]")).click();
	Thread.sleep(2000);
	selectdate(month_year,day);
	

}
}