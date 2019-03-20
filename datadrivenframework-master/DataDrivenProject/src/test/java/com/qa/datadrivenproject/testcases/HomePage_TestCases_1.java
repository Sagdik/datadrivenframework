package com.qa.datadrivenproject.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.*;

import com.baseclass.saset.Limk_Base;
import com.qa.datadrivenproject.pages.HomePage;

public class HomePage_TestCases_1 extends Limk_Base {

	HomePage homepage;
	Limk_Base base;

	public HomePage_TestCases_1() {
		super();

	}

	@BeforeMethod
	public void launchurl() {

		base = new Limk_Base();
		base.launchweburl();
	}

	@Test(priority = 0)
	public void homePageVerification() {
		homepage = new HomePage();
		homepage.validateVolunteer_button();
	}

	@Test(priority = 1)
	public void homePageRedirection() {
		homepage = new HomePage();
		homepage.validateVolunteer_button();

	}

	@Test(priority = 2)
	public void homeDonatebutton() {

		homepage = new HomePage();
		homepage.verifyDonateButton();
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
