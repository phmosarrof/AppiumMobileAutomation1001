package AndroidRealDeviceTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class Androidtest {

	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {

		// to start the appium server by coding
		AppiumDriverLocalService ser = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
				.withAppiumJS(new File(
						"C:\\Users\\Mosarrof Hossain\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\lib\\main.js"))
				.withLogFile(new File("C:\\Users\\Mosarrof Hossain\\workspace\\AppiumMobileAutomation1001\\Apps\\Logs"))
				.withArgument(GeneralServerFlag.LOCAL_TIMEZONE));
		ser.start();

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		// *[@id="tsf"]/div[2]/div[1]/div[1]/div

		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
		ser.stop();
	}

}
