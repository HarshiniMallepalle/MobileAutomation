package com.mobile.pages;

import com.mobile.base.BasePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CalculatorPage extends BasePage{

	public CalculatorPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
@AndroidFindBy(id="com.sec.android.app.popupcalculator:id/calc_keypad_btn_09")
MobileElement nine;
	
@AndroidFindBy(id="com.sec.android.app.popupcalculator:id/calc_keypad_btn_add")
MobileElement plus;

@AndroidFindBy(id="com.sec.android.app.popupcalculator:id/calc_keypad_btn_01")
MobileElement one;


	
public void pressNine() {
	nine.click();
}
public void pressPlus() {
	plus.click();
}
public void pressOne() {
	one.click();
}

	
	
	
}
