package youtubespecial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class YahooCheckboxClick {
static
{
	System.setProperty("webdriver.gecko.driver", "./Library\\Driver\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver", "./Library\\Driver\\chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
	//	WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		
		Actions actions= new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("persistent"))).click().build().perform();
		
	}

}
