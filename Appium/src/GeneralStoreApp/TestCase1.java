package GeneralStoreApp;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import Sample.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestCase1 extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		 AndroidDriver<AndroidElement> driver = generalStoreCapabilities();
		 driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Sample name");;
		 driver.hideKeyboard();
		 driver.findElement(By.xpath("//*[@text='Female']")).click();
		 driver.findElement(By.id("android:id/text1")).click();
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
		//   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));     
		 driver.findElement(By.xpath("//*[@text='Argentina']")).click();
		 driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	}

}
