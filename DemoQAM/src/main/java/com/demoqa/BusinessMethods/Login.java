	package com.demoqa.BusinessMethods;

import com.demoqa.Utilites.BrowserInitialization;
import com.demoqa.Utilites.CommonMethods;

public class Login {
	
	private static final Login obj =  new Login();
	
	public void loginPage() throws Throwable {
		
		CommonMethods.clickWebEle("//div[@class='element-list collapse show']/ul/li[1]");
		System.out.println("clicked on login");
		Thread.sleep(1000);
		CommonMethods.textBox("//input[@id='userName']","scubtest"); //"scubtest");
		Thread.sleep(1000);
		CommonMethods.textBox("//input[@id='password']", "Testing@123");//"Testing@123");
		Thread.sleep(1000);
		CommonMethods.clickbtn("//button[@id='login']");
		Thread.sleep(2000);
		//div[text()='Profile']
	}
	
	public static  Login GetInstance() {
		
		return obj;
		
	}

} 
