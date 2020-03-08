package com.reena.mynewproject;

import java.util.Date;

public class TestMainClass {

	public static void main(String[] args) {
		String myName = "Reena";
		String myFirstName = "Reena";
		String mylastName = myName + myFirstName +"";
		Date dt = new Date();
		int hr = dt.getHours();
		System.out.println(dt +"  "+ hr + "Sonar Test in Main Java files");
	}

}
