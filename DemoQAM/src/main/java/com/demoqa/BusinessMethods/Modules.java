package com.demoqa.BusinessMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.demoqa.Utilites.BrowserInitialization;
import com.demoqa.Utilites.CommonMethods;

public class Modules {

	private static final Modules obj = new Modules();

	public void clickElementsPage() throws Throwable {

		Thread.sleep(3000);

		// WebElement clickonelement =
		// BrowserInitialization.GetInstance().getdriver().findElement(By.xpath("//div[@class='category-cards']/div[1]"));
		// CommonMethods.actionClick(clickonelement);
		CommonMethods.actionClick("//div[@class='category-cards']/div[1]");
		System.out.println("got");
		Thread.sleep(3000);
	}

	public void textBoxPage() throws Throwable {

		//WebElement clickTextBox = BrowserInitialization.GetInstance().getdriver().findElement(By.xpath("(//span[@class='text'])[1]"));
		CommonMethods.clickWebEle("(//span[@class='text'])[1]");
		Thread.sleep(3000);
	}

	public void clickForms() throws Throwable {

		//// div[@class='category-cards']/div[2]
		/*WebElement clickForms = BrowserInitialization.GetInstance().getdriver().findElement(By.xpath("//div[@class='accordion']/div[2]"));
		 * CommonMethods.actionClick(clickForms);
		 */	
		CommonMethods.scrollPage();
		Thread.sleep(1000);
		CommonMethods.actionClick("//div[@class='accordion']/div[2]");
		
		Thread.sleep(2000);
	}
	
	public void clickBookStoreApplication() throws Throwable {
		
		CommonMethods.scrollPage();
		CommonMethods.actionClick("//div[@class='accordion']/div[6]");
		Thread.sleep(1000);
		System.out.println("Book Store Application");
	}

	public static Modules GetInstance() {

		return obj;
	}

}
