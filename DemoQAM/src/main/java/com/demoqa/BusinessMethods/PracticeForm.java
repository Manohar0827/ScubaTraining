package com.demoqa.BusinessMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.demoqa.Utilites.BrowserInitialization;
import com.demoqa.Utilites.CommonMethods;

public class PracticeForm {

	private static final PracticeForm obj = new PracticeForm();

	public void clickPracticeForm() throws Throwable {

		Thread.sleep(3000);
		/*
		 * WebElement clckPracticeForm =
		 * BrowserInitialization.GetInstance().getdriver().findElement(By.
		 * xpath("//span[contains(text(),'Practice Form')]"));
		 * CommonMethods.actionClick(clckPracticeForm);
		 */

		CommonMethods.actionClick("//span[contains(text(),'Practice Form')]");
		Thread.sleep(3000);

		/*
		 * BrowserInitialization.GetInstance().getdriver().findElement(By.xpath(
		 * "//input[@id='firstName']")) .sendKeys("Mano");
		 * BrowserInitialization.GetInstance().getdriver().findElement(By.xpath(
		 * "//input[@id='lastName']")) .sendKeys("Mano");
		 */

	}

	public void practiceFormPage() throws Throwable {
		
		CommonMethods.textBox("//input[@id='firstName']", "Shalini");
		Thread.sleep(2000);
		CommonMethods.textBox("//input[@id='lastName']", "Manohar");
		Thread.sleep(1000);
		CommonMethods.textBox("//input[@id='userEmail']", "Sample@gmail.com");
		Thread.sleep(1000);
		CommonMethods.radioBtn("(//label[@class='custom-control-label'])[1]");
		Thread.sleep(1000);
		CommonMethods.textBox("//input[@id='userNumber']", "95662252525");
		Thread.sleep(1000);
		/*
		 * CommonMethods.clickDatepicker(); Thread.sleep(1000);
		 * CommonMethods.selectByDate("[class='react-datepicker__month-select']", "10");
		 * Thread.sleep(1000);
		 * CommonMethods.selectByDate("[class='react-datepicker__year-select']","2020");
		 * Thread.sleep(1000); CommonMethods.clickDay(
		 * "//div[@class='react-datepicker__month-container']/child::div[2]/child::div/div"
		 * ); Thread.sleep(1000);
		 */
		CommonMethods.autoSelectTxtBox("//input[@id='subjectsInput']", "Ma");
		Thread.sleep(1000);
		CommonMethods.radioBtn("//label[@for='hobbies-checkbox-3']");
		Thread.sleep(1000);
		//CommonMethods.uploadBtn("//input[@id='uploadPicture']", "C:\\Users\\manoh\\Downloads\\Unconfirmed 605808");
		Thread.sleep(1000);
		CommonMethods.textBox("//textarea[@id='currentAddress']", "//textarea[@id='currentAddress']");
		Thread.sleep(1000);
		CommonMethods.actionClick("(//div[@class=' css-1hwfws3']//div/input)[1]");
		Thread.sleep(1000);
		CommonMethods.autoSelectTxtBox("(//div[@class=' css-1hwfws3']//div/input)[1]", "NCR");
		Thread.sleep(1000);
		CommonMethods.actionClick("(//div[@class=' css-1hwfws3']//div/input)[2]");
		Thread.sleep(1000);
		CommonMethods.autoSelectTxtBox("(//div[@class=' css-1hwfws3']//div/input)[2]", "Delhi");
		Thread.sleep(1000);
	}

	public static PracticeForm GetInstance() {
		return obj;

	}

}
