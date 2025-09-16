package youtubespecial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetRowsColWebTable {

	WebDriver driver; 
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "./Library\\Driver\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	}
}
