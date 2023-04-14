package com.mobile.base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
	
	private static AndroidDriver<MobileElement> driver;
	
	public AndroidDriver<MobileElement> launchMobileApp(){
		
	DesiredCapabilities capabalities = new DesiredCapabilities();
	
	//File appDir = new File("");
	//File newApp =new File(appDir,"");
		
	capabalities.setCapability("deviceName", "RFCR60RAP2P");
	capabalities.setCapability("platformName", "Android");
	capabalities.setCapability("platformVersion", "13");
	capabalities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
	capabalities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
	//capabalities.setCapability("app",newApp.getAbsolutePath());

	try {
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabalities);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		return driver;
		
	}
	
	

}
