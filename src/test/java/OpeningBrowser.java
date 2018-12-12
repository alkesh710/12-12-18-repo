import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpeningBrowser {
	WebDriver driver;
	@Test
	public void testBrowser()
	{
		System.setProperty("webdriver.chrome.driver","F:\\TESTNG VIDEO OF ALKESH\\alkesh selenium all software\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		
	}

}
