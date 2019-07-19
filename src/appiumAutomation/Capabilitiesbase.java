package appiumAutomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilitiesbase {
	
	
	public static AndroidDriver<AndroidElement> driver;
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {

		//File fs = new File("src");
		//File f = new File(fs, "ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		//cap.setCapability(MobileCapabilityType.APP, "MyPhone");
		
		 driver = new AndroidDriver<AndroidElement>(
				new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		return driver;
	}
}
