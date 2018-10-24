package appiumAutomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileAutomation {

	public static void main(String[] args) throws MalformedURLException {

		File fs = new File("src");
		File f = new File(fs,"demoapi.apk")
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "MyPhone");
		cap.setCapability(MobileCapabilityType.APP, "MyPhone");
		AndroidDriver <AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1.4723/wd/hub"), cap);
		
		
	}

}
