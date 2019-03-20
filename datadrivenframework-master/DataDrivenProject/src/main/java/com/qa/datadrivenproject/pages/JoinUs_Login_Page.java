package com.qa.datadrivenproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.saset.Limk_Base;
import com.excel.utility.Utilities;

public class JoinUs_Login_Page extends Limk_Base {

	public String userType;
	Utilities utility = new Utilities();

	// WebElement to click on joinButton
	@FindBy(xpath = "//li[@id='menu-item-1682']//span[@class='ubermenu-target-title ubermenu-target-text'][contains(text(),'Join Us')]")
	WebElement joinButton;

	// WebElement to click on Login and Registration
	@FindBy(xpath = "//*[@id='menu-item-396']")
	WebElement login_Register_Button;

	// WebElement to click on Individual
	@FindBy(xpath = "//p[contains(text(),'Individual')]")
	WebElement individualButton;

	// WebElement to click on School
	@FindBy(xpath = "//p[contains(text(),'School')]")
	WebElement schoolButton;

	// WebElement To click on Corporation
	@FindBy(xpath = "//p[contains(text(),'Corporation')]")
	WebElement corporationButton;

	// WebElement to userName for school
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement signInButton;

	// WebElement to SignUpButton
	@FindBy(xpath = "//a[contains(text(),'Sign up')]")
	WebElement signUpButton;

	// WebElement for Facebook SignUp
	@FindBy(xpath = "//div[@id='signup']//a[@title='Connect with Facebook'][contains(text(),'Facebook')]")
	WebElement facebookSignUp;

	// WebElement for Gmail Signup
	@FindBy(xpath = "//div[@id='signup']//a[@title='Connect with Google'][contains(text(),'Google')]")
	WebElement gmailSignUp;

	// WebElement to Sign Up Button for email login
	@FindBy(xpath = "//p[@id='signupemail']")
	WebElement emailSignupButton;

	// WebElement to facebooklogin
	@FindBy(xpath = "//div[@id='login']//a[contains(text(),'Facebook')]")
	WebElement facebookLogin;

	// WebElement to gmail Login
	@FindBy(xpath = "//div[@id='login']//a[contains(text(),'Google')]")
	WebElement gmailLogin;

	// WebElement to login with Email
	@FindBy(id = "loginemail")
	WebElement loginWithEmail;

	// WebElement to login page back button
	@FindBy(xpath = "//a[@class='nav-buttons mainback']")
	WebElement login_Back_Button;

	// WebElement for Sign up Back Button
	@FindBy(xpath = "//p[@class='nav-button']//a[@class='nav-buttons'][contains(text(),'< Back')]")
	WebElement signUp_Back_Button;

	public JoinUs_Login_Page() {
		PageFactory.initElements(driver, this);
	}

	public void signInPage(String userType) {

		try {
			this.userType = userType;
			
			// Click on Join button
			joinButton.click();
			System.out.println("successfully click on join button");
			utility.pageLoadTimout();

			// Click on login and registration Button
			login_Register_Button.click();
			System.out.println("successfully click on Login button");
			Thread.sleep(5000);

			// Select The Type of User To login Individual,School and 
			
			if (userType.contentEquals("Individual")) {
				individualButton.click();
				Thread.sleep(10000);
				signInButton.click();
				System.out.println("successfully click on signIn button");
			} else if (userType.equalsIgnoreCase("school")) {
				schoolButton.click();
				Thread.sleep(10000);
				signInButton.click();
				Thread.sleep(10000);
				System.out.println("successfully click on signIn button");
			} else {
				corporationButton.click();
				Thread.sleep(10000);
				signInButton.click();
				Thread.sleep(10000);
				System.out.println("successfully click on signIn button");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to find Web Elemenet" + e);
		}
	}

	
	  public void signInUser(String Username,String Password) {
	  
	  }
	 

}
