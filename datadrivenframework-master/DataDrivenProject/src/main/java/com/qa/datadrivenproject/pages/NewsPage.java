package com.qa.datadrivenproject.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.saset.Limk_Base;
import com.excel.utility.Utilities;

public class NewsPage extends Limk_Base {

	// Create object of the utility class
	Utilities utility = new Utilities();

	// WebElement of News Button
	@FindBy(id = "menu-item-397")
	WebElement NewsButton;

	// WebElement for click on Articles on News Page
	@FindBy(xpath = "//a[contains(text(),'Phase 2 of Forest Restoration Project Completed by')]")
	WebElement article_News;

	// WebElement for Click on Articles and Fetch the text
	@FindBy(xpath = "//h2[contains(text(),'Phase 2 of Forest Restoration Project Completed by')]")
	WebElement article_News_Text;

	// WebElement To click on Wild life Article Button
	@FindBy(xpath = "//a[contains(text(),'White Rumped Shama')]")
	WebElement article_Wildlife;

	// WebElement for click on Article on Pahang
	@FindBy(xpath = "//a[contains(text(),'Protected Areas in Pahang')]")
	WebElement article_pahang;

	// WebElement for click on article depend on Ecology
	@FindBy(xpath = "//a[@title='Kuala Tahan National Park']//img[@class='vc_single_image-img attachment-medium']")
	WebElement article_Ecology;

	// WebElement for article depends on Culture
	@FindBy(xpath = "//a[@title='Congkak']//img[@class='vc_single_image-img attachment-medium']")
	WebElement article_culture;

	// WebElement for polls Button(Yes)
	@FindBy(xpath = "//div[contains(text(),'Yes')]")
	WebElement article_polls_yes;

	// WebElement For polls button (NO)
	@FindBy(xpath = "//div[@id='survey_answer2']")
	WebElement article_polls_no;

	// WebElement for polls button(Idon't know)
	@FindBy(xpath = "//div[@id='survey_answer3']")
	WebElement article_polls_dont;

	@SuppressWarnings("unused")
	private String option;

	/*
	 * Function of news Tab
	 */
	public NewsPage() {
		super();
		PageFactory.initElements(driver, this);
	}

	/*
	 * Function of WildLifeTab
	 */

	public void wildlife_func() {
		try {
			NewsButton.click();
			utility.pageLoadTimout();
			System.out.println("Click on News Button");
			article_News.click();
			utility.implicitDurationTime();
			System.out.println(article_News_Text.getText());

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

	/*
	 * Function of Pahang Page
	 */
	public void pahang_func() {

		try {
			NewsButton.click();
			utility.pageLoadTimout();
			article_pahang.click();
			utility.implicitDurationTime();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Unable to load pahang function" + e);

		}

	}

	/*
	 * Function of Ecology page
	 */

	public void ecology_func() {

		try {
			NewsButton.click();
			utility.pageLoadTimout();
			utility.scollPageEnd("window.scrollTo(0, document.body.scrollHeight)");
			article_Ecology.click();
			utility.implicitDurationTime();
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	/*
	 * Function of culture function
	 */

	public void culture_func() {

		try {

			NewsButton.click();
			Thread.sleep(10000);
			utility.scollPageEnd("window.scrollTo(0, document.body.scrollHeight)");
			article_culture.click();
			utility.implicitDurationTime();

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	/*
	 * Function of Polls Functinality
	 */
	public void polls_func(String option) {
		try {
			this.option = option;
			utility.pageLoadTimout();
			NewsButton.click();
			utility.pageLoadTimout();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(5000);

			// In polls if user click on yes
			if (option.equalsIgnoreCase("yes")) {
				article_polls_yes.click();

				System.out.println(article_polls_yes.getText());
			}
			// In Polls if user click on No
			else if (option.equalsIgnoreCase("no")) {
				article_polls_no.click();
				System.out.println(article_polls_no.getText());
			} else {
				article_polls_dont.click();
				System.out.println(article_polls_dont.getText());
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
