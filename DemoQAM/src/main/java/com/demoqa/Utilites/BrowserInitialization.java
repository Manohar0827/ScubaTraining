package com.demoqa.Utilites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInitialization {

	public static WebDriver driver;
	private static final BrowserInitialization obj = new BrowserInitialization();

	public static void launchChrome() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);

	}

	public static void closeChrome() {
		driver.close();
		driver.quit();
	}

	public WebDriver getdriver() {

		return driver;
	}

	public static BrowserInitialization GetInstance() {

		return obj;

	}

}
