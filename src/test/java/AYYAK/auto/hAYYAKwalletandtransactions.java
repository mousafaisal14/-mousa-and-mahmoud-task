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

public class hAYYAKwalletandtransactions extends hAYYAKBaseTest {

	public class wallets extends hAYYAKBaseTest {

		@Test(description = "swipe wallet left")
		public void swipeleft() {

			driver.findElement(By.xpath("")).click();
			WebElement walletcard = driver.findElement(By.xpath(""));
			Assert.assertEquals(driver.findElement(By.xpath("")).getAttribute("focusable"), "true");
			SwipeAction(walletcard, "Left");
			Assert.assertEquals(
					driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"), "false");
		}

		@Test(description = "swipe wallet right")
		public void swiperight() {

			driver.findElement(By.xpath("")).click();
			WebElement walletcard = driver.findElement(By.xpath(""));
			Assert.assertEquals(driver.findElement(By.xpath("")).getAttribute("focusable"), "true");
			SwipeAction(walletcard, "right");
			Assert.assertEquals(
					driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"), "false");

		}

		@Test(description = " scroll down to see all the cards")
		public void scroll() {
			boolean Scrollmore;
			Scrollmore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap
					.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", "down", "percent", 3.0));
		}

		@Test(description = "fullview for the card+screenrotation+scrolldown ")
		public void Titleforfullviewcard() {

			driver.findElement(AppiumBy.accessibilityId("")).click();
			String TITLE1 = driver.getTitle();
			System.out.println(TITLE1);
		}

		@Test(description = "update status then come back to home page,verify if the update status is the same  ")
		public void updatestatus1() {
			driver.findElement(By.id("")).click();
			driver.findElement(By.xpath("")).click();
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			String sta1 = driver.findElement(By.className("")).getText();
			Assert.assertEquals(sta1, "");
		}

		@Test(description = "update status ,then verify lf the status is the same into card")
		public void updatestatus() {
			driver.findElement(AppiumBy.accessibilityId("")).click();
			driver.findElement(By.xpath("\\tagname[2]")).click();
			String Card1 = driver.findElement(By.className("")).getText();
			Assert.assertEquals(Card1, "");
			driver.findElement(By.id("")).click();
		}

		@Test(description = "For getting Text into wallet card")
		public void Textassetcard() {
			// for getting Text into asset card
			String AssetCard = driver.findElement(By.xpath("")).getText();
			Assert.assertEquals(AssetCard, "");
		}

		@Test(description = "list of card to get text and size")
		public void listcard() {
			int asset = driver.findElements(By.id("")).size();
			for (int i = 0; i < asset; i++) {
				String asset7 = driver.findElements(By.className("")).get(i).getText();
				System.out.println(i);
				System.out.println(asset7);
			}

		}
	}
}
