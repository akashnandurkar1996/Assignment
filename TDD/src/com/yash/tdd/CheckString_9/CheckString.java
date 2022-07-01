package com.yash.tdd.CheckString_9;

public class CheckString {

	
	public static String removespecial(String str) {
       String convertedstring;
      convertedstring= str.replaceAll("[^a-zA-Z ]", "");
		return convertedstring;
	}
		
	
	public static void main(String[] args) {
		System.out.println(CheckString.removespecial("This@ Red $car-."));
	}
}
