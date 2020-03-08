package com.reena.mynewproject;

import java.util.Date;

public class TestClass1 {

	public static void main(String[] args) {
		String myName = "Reena";
		String myFirstName = "Reena";
		String mylastName = myName + myFirstName +"";
		Date dt = new Date();
		int hr = dt.getHours();
		System.out.println(dt +"  "+ hr);
	}

}
