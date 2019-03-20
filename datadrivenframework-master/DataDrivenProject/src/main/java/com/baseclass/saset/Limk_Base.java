package com.baseclass.saset;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Limk_Base {

	String browserName;
	String osName;
	public static WebDriver driver;
	public static Properties pro;

	public Limk_Base() {
		super();
		try {
			pro = new Properties();
			FileInputStream file;
			file = new FileInputStream("./Configuration/config.properties");
			pro.load(file);
		} catch (Exception e) {
			System.out.println("unable to load properties file" + e.getStackTrace());
		}
	}

	public void launchweburl() {
		
		browserName = pro.getProperty("browser");
		osName=pro.getProperty("osName");
		
		/*
		 * Browser Launch If Operating system is in Window
		 */
	if(osName.contentEquals("Window"))
	{
		if (browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setJavascriptEnabled(true);
			cap.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"./driver/phantomjs.exe");
			driver = new PhantomJSDriver(cap);
		}
		
	}
	/*
	 * Browser Launch If operating System is in Mac Os
	 */
	else
	{
		if (browserName.equalsIgnoreCase("chrome")) {
			// if(os="mac")
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
			driver = new FirefoxDriver();
		} else {
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setJavascriptEnabled(true);
			cap.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"./driver/phantomjs.exe");
			driver = new PhantomJSDriver();
		}
		
	}
	driver.get(pro.getProperty("Page_Url"));
	driver.manage().window().maximize();
	}
}
