package com.appium.curso.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculadoraTeste {
	
	@Test
    public void deveSomarDoisValores() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:deviceName", "ZY22BMHBZ5");
        desiredCapabilities.setCapability("appium:platformVersion", "11.0");
        desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
        desiredCapabilities.setCapability("appium:appPackage", "com.google.android.calculator");
        desiredCapabilities.setCapability("appium:appActivity", "com.android.calculator2.Calculator");

        AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
    
        driver.findElementByAccessibilityId("2").click();
        driver.findElementByAccessibilityId("mais").click();
        driver.findElementByAccessibilityId("2").click();
        driver.findElementByAccessibilityId("igual").click();
        MobileElement el5 = (MobileElement) driver.findElementById("com.google.android.calculator:id/result_final");
        //System.out.println(el5.getText());
        Assert.assertEquals("4", el5.getText());
        driver.quit();

    }
}
