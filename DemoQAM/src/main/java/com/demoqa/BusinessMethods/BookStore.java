package com.demoqa.BusinessMethods;

import org.openqa.selenium.By;

import com.demoqa.Utilites.BrowserInitialization;
import com.demoqa.Utilites.CommonMethods;

public class BookStore {
	
private static final BookStore obj =new BookStore();
	
	public void bookStorePage() throws Throwable {
		
		Thread.sleep(1000);
		CommonMethods.scrollPage();
		CommonMethods.clickWebEle("//div[@class='element-list collapse show']/ul/li[2]");
		System.out.println("Book Store");
		CommonMethods.textBox("//input[@id='searchBox']", "git");
		//CommonMethods.autoSelectTxtBox("//input[@id='searchBox']", "git");
		
		BrowserInitialization.GetInstance().getdriver().findElement(By.linkText("Git Pocket Guide")).click();
		CommonMethods.scrollPage();
		Thread.sleep(1000);
		CommonMethods.clickbtn("//button[@id='addNewRecordButton']");
		
		Thread.sleep(2000);
}
	public static BookStore GetInstance() {
		return obj;
		
	}
}
