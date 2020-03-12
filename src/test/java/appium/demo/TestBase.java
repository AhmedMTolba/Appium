package appium.demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestBase extends ExtentReport {

	AndroidDriver<MobileElement> driver;
	
	@BeforeClass
	public void Intilaization() throws MalformedURLException {
		
		try {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "4.4.2");
		caps.setCapability("deviceName", "GT-19301l");
		caps.setCapability("app", "C:\\Users\\User\\Downloads\\EriBank.apk");
		caps.setCapability("automationName", "UiAutomator1");
		caps.setCapability("udid", "e15c631d");
		driver=  new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		} catch (Exception e ){
			System.out.println("The Cause is .. "+e.getCause());
			System.out.println("Message is ....  " + e.getMessage());
			e.printStackTrace();
		}
	}
	@AfterClass
	public void TearDown() {
		driver.quit();
	}
	
	
	
	
}
