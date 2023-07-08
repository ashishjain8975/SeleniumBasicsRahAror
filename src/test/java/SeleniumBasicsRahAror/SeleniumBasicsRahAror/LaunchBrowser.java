package SeleniumBasicsRahAror.SeleniumBasicsRahAror;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	
@Test
public void launchBrowsers()
{

	WebDriver driver=new ChromeDriver();
	driver.get("https://way2automation.com");
	
	System.out.print(driver.getTitle());
	
	
}



}
