package casestudy_stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class casestudy_drivers {
	public static WebDriver getDriver(String browser) {
		// TODO Auto-generated method stub
		if(browser.contentEquals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
            return new ChromeDriver();
		}
		else if(browser.contentEquals("ie")) {
			System.setProperty("webdriver.ie.driver","C:\\drivers\\IEDriverServer.exe");
            return new InternetExplorerDriver();
		}
		else if(browser.contentEquals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
            return new FirefoxDriver();
		}
		else {
		return null;
		}
	}

}
