package com.demoqa.BusinessMethods;

import com.demoqa.Utilites.CommonMethods;

public class Profile {
	
	private static final Profile obj =new Profile();
	
	public void profilePage() {
		
		String CurrUrl = CommonMethods.getCurrUrl();
		String ActUrl = "https://demoqa.com/profile";
		
		if(CurrUrl.equals(ActUrl)) {
			
			System.out.println("Your on profile Page");
		}
		
	}
	
	public static Profile GetInstance() {
		return obj;
		
	}

}
