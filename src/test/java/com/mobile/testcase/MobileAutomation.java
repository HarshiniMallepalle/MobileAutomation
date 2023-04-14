package com.mobile.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mobile.base.BaseTest;
import com.mobile.pages.CalculatorPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MobileAutomation extends BaseTest {

	AndroidDriver<MobileElement> driver;
	CalculatorPage calc;
	
	@BeforeMethod
	public void beforeMethod(){
		driver=launchMobileApp();
		calc =new CalculatorPage(driver);
	}

	@Test
	public void validateCalculator() {
	calc.pressNine();
	calc.pressPlus();
	calc.pressOne();
	}

	@AfterMethod
	public void tearDown() {
       driver.quit();
	}

}
