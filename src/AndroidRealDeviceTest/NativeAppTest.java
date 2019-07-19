package AndroidRealDeviceTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class NativeAppTest {

	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		//File app = new File(".\\Apps\\remotecontent.apk");

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		// To worked on the installed application without apk file 
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.selendroid");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".HomeScreenActivity");
		//cap.setCapability("App", app.getAbsolutePath());

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

	}

	
}
