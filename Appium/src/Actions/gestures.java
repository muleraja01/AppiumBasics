package Actions;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import Sample.base;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;



public class gestures extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//To Tap in mobile use TouchAction(driver)
		TouchAction touchAction =new TouchAction(driver);
		WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		/*
		 * import static io.appium.java_client.touch.offset.ElementOption.element;
		 * import static io.appium.java_client.touch.TapOptions.tapOptions;*/
		touchAction.tap(tapOptions().withElement(ElementOption.element(expandList))).perform();
		
		/* 
		 * import static java.time.Duration.ofSeconds;
		 * import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
		 */
		
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		WebElement peopleNames = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		touchAction.longPress(longPressOptions().withElement(element(peopleNames)).withDuration(ofSeconds(2))).release().perform();
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		System.out.println(driver.findElementById("android:id/title").getText());
		
	}

}
