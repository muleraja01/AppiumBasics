import static io.appium.java_client.touch.offset.ElementOption.element;

import org.openqa.selenium.WebElement;

import Sample.base;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FunctionlLibrary extends base{
	public static AndroidDriver<AndroidElement> driver;
	public static TouchAction touchAction=new TouchAction(driver);

	
	public static void dragdrop(WebElement source, WebElement destination) {
		touchAction.longPress(element(source)).moveTo(element(destination)).release().perform();
	}
	public static void scroll(String text) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));");
	}

}
