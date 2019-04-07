package com.junitexamples;

import java.util.ArrayList;

import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

public class EmailValidator {

	String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
            "[a-zA-Z0-9_+&*-]+)*@" + 
            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
            "A-Z]{2,7}$";
	
    public boolean isEmailValid(String email) {
    	return Pattern.matches(this.emailRegex, email);
    }
	
	public ArrayList removeInvalidEMails(ArrayList<String> emailList) {
		
		ArrayList<String> listToReturn = new ArrayList<String>();
		
		for(String email : emailList) {
			if(this.isEmailValid(email)) {
				listToReturn.add(email);
			}
		}
		
		return listToReturn;
		
	}
	
	public static void main(String args[]){
		
	}
	
}
