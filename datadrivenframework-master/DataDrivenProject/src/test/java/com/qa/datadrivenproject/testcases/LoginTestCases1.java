package com.qa.datadrivenproject.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.saset.Limk_Base;
import com.qa.datadrivenproject.pages.JoinUs_Login_Page;

public class LoginTestCases1 extends Limk_Base {

	JoinUs_Login_Page loginPage;

	public LoginTestCases1() {
		super();

	}

	@BeforeMethod
	public void launchurl() {
		launchweburl();
	}

	@Test(priority=0,dependsOnGroups="Regression")
	public void login_Profile() {
		loginPage = new JoinUs_Login_Page();
		loginPage.signInPage("individual");

	}

	@Test(priority=1,dependsOnGroups="Regression")
	public void school_Login() {
		loginPage = new JoinUs_Login_Page();
		loginPage.signInPage("School");
	}

	@Test(priority=2,dependsOnGroups="Regression")
	public void cooperation_Login() {
		loginPage = new JoinUs_Login_Page();
		loginPage.signInPage("corporation");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
