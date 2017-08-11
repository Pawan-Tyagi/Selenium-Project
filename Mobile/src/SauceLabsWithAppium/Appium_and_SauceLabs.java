package SauceLabsWithAppium;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

public class Appium_and_SauceLabs {
	private static AndroidDriver driver;
	public static final String USERNAME = "ravimajhi";
	public static final String ACCESS_KEY = "cf1f8bb8-c210-4a2a-90e2-6c02e8bce865";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	
	@BeforeTest
	public void launchApp() throws MalformedURLException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("platformName", "Android");
	    capabilities.setCapability("deviceName", "Samsung Galaxy S4 Emulator");
	    capabilities.setCapability("platformVersion", "6.0");
	    capabilities.setCapability("appPackage", "org.nativescript.nativescriptui");
		capabilities.setCapability("appActivity", "com.tns.NativeScriptActivity");
	    //capabilities.setCapability("app", "http://saucelabs.com/example_files/ContactManager.apk");
	    capabilities.setCapability("browserName", "");
	    capabilities.setCapability("deviceOrientation", "portrait");
	    capabilities.setCapability("appiumVersion", "1.4.16.1");
	    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    driver.manage().timeouts().implicitlyWait(200L, TimeUnit.SECONDS);
		
		
		
	}
	
	
	

}
