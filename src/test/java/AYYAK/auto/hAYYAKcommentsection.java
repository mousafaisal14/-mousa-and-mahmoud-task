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

public class hAYYAKcommentsection extends hAYYAKBaseTest {

	@Test(description = "verify user can write a comment")
	public void sendcomment() throws MalformedURLException, InterruptedException {

		driver.findElement(AppiumBy.className("")).sendKeys("test comment");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));

		String commentText = driver.findElement(By.id("")).getText();
		Assert.assertEquals(commentText, "test comment");

	}

	@Test(description = "verify the comment creator name")
	public void verifythename() throws MalformedURLException, InterruptedException {

		String commentcreatorname = driver.findElement(By.id("")).getText();
		Assert.assertEquals(commentcreatorname, "mousa faisal");

	}

	@Test(description = "verify user can upload attachment file as a comment")
	public void uploadImage() throws MalformedURLException, InterruptedException {

		driver.findElement(AppiumBy.className("")).click();
		;
		driver.findElement(AppiumBy.accessibilityId("")).click();
		driver.findElement(By.xpath("")).click(); // we use this cuz we do not have attribut **[2]: to make it cuz we
													// have two with same id so thats how we select the second one
		driver.findElement(By.xpath("")).click();

	}

	@Test(description = "verify user can make comment with voice record")
	public void commentwithvoicenote() throws MalformedURLException, InterruptedException {

		driver.findElement(AppiumBy.className("")).click();
		;
		driver.findElement(AppiumBy.accessibilityId("")).click();
		driver.findElement(By.xpath("")).click();

	}

	@Test(description = "verify user can listen to the record ")
	public void listentotherecord() throws MalformedURLException, InterruptedException {

		driver.findElement(By.xpath("")).click();

	}

	@Test(description = "verify user can delete the record")
	public void deletetherecord() throws MalformedURLException, InterruptedException {

		driver.findElement(AppiumBy.accessibilityId("")).click();

	}

	@Test(description = "verify the user can delete a comment")
	public void deletecomments() throws MalformedURLException, InterruptedException {

		driver.findElement(AppiumBy.className("")).click();
		;
		driver.findElement(AppiumBy.accessibilityId("")).click();

	}

}

//xpath, id, accessibility, classname, androidAutomator  -->accessibility , androidAutomator just for appiumby.
