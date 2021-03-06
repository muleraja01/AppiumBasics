package Actions;
import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import Sample.base;

public class SwipeDemo extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		TouchAction touchAction=new TouchAction(driver);
		WebElement first = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement second = driver.findElementByXPath("//*[@content-desc='45']");
		/**
		 * import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
		 * import static io.appium.java_client.touch.offset.ElementOption.element;
		 * import static java.time.Duration.ofSeconds;
		 */
		touchAction.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2)))
					.moveTo(element(second)).release().perform();
	}
	

}
