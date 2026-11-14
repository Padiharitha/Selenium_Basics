package Testcase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Mobile_Testing
{
public AndroidDriver driver;

@BeforeTest
public void Setup() throws MalformedURLException
{
	String appiumServerUrl = "http://127.0.0.1:4723";
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability("platformName", "Android");
	dc.setCapability("appium:automationName", "uiautomator2");
	dc.setCapability("appium:app", System.getProperty("user.dir")+ "/Apps/ApiDemos.apk");
	
	driver = new AndroidDriver(new URL(appiumServerUrl) , dc);
}

@Test
public void test()
{
	driver.findElement(AppiumBy.accessibilityId("Access'ibility")).click();
}

@AfterTest
public void close()
{
	driver.close();
	driver.quit();
}

}
