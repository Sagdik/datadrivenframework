package com.excel.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

import com.baseclass.saset.Limk_Base;

public class Utilities extends Limk_Base {

	// Data for page load timeout
	public static long Page_LOAD_TIMEOUT = 60;

	// Data for Implicit Time out
	public static long IMPLICIT_WAIT = 30;

	// Mark java script for make page scroll
	JavascriptExecutor js = (JavascriptExecutor) driver;

	/*
	 * Implicit Timeout function for WebElements
	 */
	public void implicitDurationTime() {
		driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
	}

	/*
	 * Page load Timeout function for TestCases
	 */

	public void pageLoadTimout() {
		
		//Page Load Time Out for Page
		driver.manage().timeouts().pageLoadTimeout(Page_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}

	/*
	 * Scroll Page till End
	 */

	public void scrollPage(String text, WebElement element) {
            
		//Page scroll feature for (String,Variable)
	
		js.executeScript(text, element);
	}

	/*
	 * scroll Paeg Till END of the Page
	 */
	public void scollPageEnd(String scroll_end) {
		js = (JavascriptExecutor) driver;
		js.executeScript(scroll_end);
	}

}
