package Actions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import Sample.base;
public class Uiautomatortest extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Syntax for AndroidUIAutomator ->driver.findElementByAndroidUIAutomator("attribute("value")")
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//Validate Clickable feature for all options
		//Syntax-> driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)")
		int size = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
		System.out.println(size);
	}

}
