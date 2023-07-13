package AYYAK.auto;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class hAYYAKnotification extends hAYYAKBaseTest {

	@Test(description = "search in notification")
	public void notificationsear() throws MalformedURLException, InterruptedException {
		driver.findElement(AppiumBy.className("")).sendKeys("");
		String notificationtitle = driver.findElement(By.id("")).getText(); // title text
		Assert.assertEquals(notificationtitle, "");
		Assert.assertTrue(driver.findElement(By.id("")).isDisplayed());
	}

	@Test(description = "scroll")
	public void notificationscroll() throws MalformedURLException, InterruptedException {

		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"\"));"));

	}
}

