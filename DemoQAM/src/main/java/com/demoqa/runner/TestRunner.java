package com.demoqa.runner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoqa.BusinessMethods.BookStore;
import com.demoqa.BusinessMethods.Login;
import com.demoqa.BusinessMethods.Modules;
import com.demoqa.BusinessMethods.PracticeForm;
import com.demoqa.BusinessMethods.Profile;
import com.demoqa.Utilites.BrowserInitialization;

public class TestRunner {

	@BeforeTest
	public void launchBrowser() throws Throwable {
			
		BrowserInitialization.launchChrome();
	}
	
	@Test
	public void forms() throws Throwable {
		Modules.GetInstance().clickElementsPage();
		//Modules.GetInstance().textBoxPage();
		Modules.GetInstance().clickForms();
		PracticeForm.GetInstance().clickPracticeForm();
		PracticeForm.GetInstance().practiceFormPage();
	/*	Modules.GetInstance().clickBookStoreApplication();
		Login.GetInstance().loginPage();
		Profile.GetInstance().profilePage();
		BookStore.GetInstance().bookStorePage(); */
	}
	
	@AfterTest
	public void closeBroswer() {
		
		BrowserInitialization.closeChrome();
		
	} 
}