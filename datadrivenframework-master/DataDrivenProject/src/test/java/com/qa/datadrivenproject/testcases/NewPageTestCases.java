package com.qa.datadrivenproject.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.*;
import com.baseclass.saset.Limk_Base;
import com.qa.datadrivenproject.pages.NewsPage;

@Listeners(com.excel.utility.Listener.class)

public class NewPageTestCases extends Limk_Base {

	NewsPage news;
	Limk_Base base;

	public NewPageTestCases() {
		super();
	}

	@BeforeMethod

	public void launchurl() {
		launchweburl();

	}

	@Test(priority = 0)
	public void wildlife_TestCase() {
		news = new NewsPage();
		news.wildlife_func();
	}

	@Test(priority = 1)
	public void pahangPage_TestCase() {
		news = new NewsPage();
		news.pahang_func();
	}

	@Test(priority = 2)
	public void ecology_TestCase() {
		news = new NewsPage();
		news.ecology_func();
	}

	@Test(priority = 3)
	public void culutural_TestCases() {
		news = new NewsPage();
		news.culture_func();
	}

	@Test(priority = 0)
	public void pollsTestCases() {
		news = new NewsPage();
		news.polls_func("dont");
	}

	@AfterMethod
	public void browserclose() {

		driver.close();
	}
}
