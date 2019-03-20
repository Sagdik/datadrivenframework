package com.qa.datadrivenproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Project_OngoingPage {


	@FindBy(xpath="//h1[contains(text(),'Go Green with SASET')]")
	WebElement textDonatePage;
}
