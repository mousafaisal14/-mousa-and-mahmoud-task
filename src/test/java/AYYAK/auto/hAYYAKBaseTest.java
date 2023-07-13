package AYYAK.auto;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class hAYYAKBaseTest {

	public AndroidDriver driver;
	public AppiumDriverLocalService service;

	@BeforeClass
	public void ConfigerAppium() throws MalformedURLException {

		/* code to start appium */
		service = new AppiumServiceBuilder()
				.withAppiumJS(new File(
						"C:\\Users\\ThinkPad\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Mousa");
		options.setApp(
				"C:\\Users\\ThinkPad\\eclipse-workspace\\auto\\src\\test\\java\\resources\\application-7b10788e-50bc-40ad-bdab-c1400f033c27.apk");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options); // Create object from the driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public void LongPressAction(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "duration", 2000));
	}
	public void ScrollToEndAction()
	{
		boolean canScrollMore;
		do {
		canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0));
		}while(canScrollMore);
		
	}
	public void SwipeAction(WebElement ele, String direction) {
		
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId",((RemoteWebElement) ele).getId(),
				
				"direction", direction, "percent", 0.75));	
		
		
		
	}
	public Double getFormattedAmount(String amount)
	{
		Double price =Double.parseDouble(amount.substring(1));
		return price;
		
		
		
	}

	@AfterClass
	public void tearDown() {

		driver.quit();
		service.stop(); // stop server
	}
}