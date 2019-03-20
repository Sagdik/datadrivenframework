package com.qa.datadrivenproject.pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.baseclass.saset.Limk_Base;
import com.excel.utility.Utilities;

public class HomePage extends Limk_Base {

	//String to store expected value 
	String VolunterPageExpectedtext = "Be A Volunteer\n" + "Together We Can Save the Environment";

	String homepagetitle = "Welcome to the\n" + "Sultan Ahmad Shah Environmental Trust ";

	String volunterpagetitle;
	String HomePageTitle;

	// Element to click on Volunteer button
	@FindBy(xpath = "//div[contains(text(),'Volunteer')]")
	WebElement volunteer;

	// Element to click on Donate button
	@FindBy(xpath = "//div[contains(text(),'Donate')]")
	WebElement donate;

	// Elements to click on Survey button 'Yes'
	@FindBy(xpath = "//div[@id='survey_answer1']")
	WebElement button1;

	// Elements to click on Survey button 'No'
	@FindBy(xpath = "//div[@id='survey_answer2']")
	WebElement button2;

	// Elements to click on Survey button 'i Don't Know'
	@FindBy(xpath = "//div[@id='survey_answer3']")
	WebElement button3;

	// Element To click on Going On Button on home page
	@FindBy(xpath = "//a[contains(text(),'What’s going on?')]")
	WebElement whatsgoingon;

	// Element to click on Damage button on home page
	@FindBy(xpath = "//span[contains(@class,'ubtn-data ubtn-text')]")
	WebElement checkDamage;

	// Element to click on Donate button on footer
	@FindBy(xpath = "//div[contains(@class,'vc_custom_1499073438238')]"
			+ "//img[contains(@class,'vc_single_image-img attachment-full')]")
	WebElement donatebutton;

	// Element to click on Volunteer button on footer
	@FindBy(xpath = "//div[contains(@class,'vc_custom_1499073405130')]"
			+ "//img[contains(@class,'vc_single_image-img attachment-full')]")
	WebElement volunteerbutton;

	// Element to click on Text ofVoulnterPage
	@FindBy(xpath = "//div[@class='container-fluid sections section4']//h1[1]")
	WebElement textofVolenterpage;

	// Element to store saset log button
	@FindBy(xpath = "//a[@class='sticky-logo']//img[contains(@class,'preload-me')]")
	WebElement sasetlog_button;

	// Element to get the title of homepage
	@FindBy(xpath = "//div[@id='slide-8-layer-1']")
	WebElement titleofhomepage;

	// Element to get the text of donatebutton
	@FindBy(xpath = "//h1[contains(text(),'Go Green with SASET')]")
	WebElement textDonatePage;

	// Create variable for utility
	Utilities utility = new Utilities();

	/*
	 * page factory initialization
	 */
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	/*
	 * Validate volunteer button functionality
	 */
	public void validateVolunteer_button() {

		try {
			// click on volunter button on home page
			volunteer.click();

			// Wait for page to load which is 30 sec maximum time
			utility.pageLoadTimout();

			// Verify text getting from the page
			volunterpagetitle = textofVolenterpage.getText();

			// verify Page title should show on page
			System.out.println(volunterpagetitle);

			// External/Additional wait for 3 sec
			Thread.sleep(3000);

			// Validate the value getting from the page with expected value
			Assert.assertEquals(volunterpagetitle, VolunterPageExpectedtext);

		} catch (ElementClickInterceptedException e) {
			System.out.println("unable to find element " + e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * User Redirect to Home Page function
	 */

	public void redirectToHomePage() {
		try {
			// Click on Volunteer Page
			volunteer.click();

			// Get the title of page and store in variable
			volunterpagetitle = textofVolenterpage.getText();

			// print the page title
			System.out.println(volunterpagetitle);

			// Validate the page value with expected Value
			Assert.assertEquals(volunterpagetitle, VolunterPageExpectedtext);

			// Click on Saset Logo to redirect the home page
			sasetlog_button.click();

		} catch (ElementClickInterceptedException e) {
			System.out.println("unable to find element " + e);
		}
	}

	public void verifyDonateButton() {
		donate.click();
		System.out.println(textDonatePage.getText());

	}

}
