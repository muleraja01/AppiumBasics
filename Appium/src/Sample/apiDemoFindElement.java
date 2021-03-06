package Sample;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class apiDemoFindElement  {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		File appDir = new File("src");
		File app = new File(appDir, "ApiDemos-debug.apk");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Raja");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");// new step
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability("appPackage","io.appium.android.apis");
		cap.setCapability("appActivity","io.appium.android.apis.ApiDemos");
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);


	}

}
