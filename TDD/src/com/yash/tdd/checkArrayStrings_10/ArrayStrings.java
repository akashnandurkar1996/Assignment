package com.yash.tdd.checkArrayStrings_10;

public class ArrayStrings {

	public static String checkArrayString(String[] str) {
		String convertedstring;

		StringBuffer sb = new StringBuffer();
		for (String s : str) {
			sb.append(s + "-");
		}
		sb.deleteCharAt(sb.length() - 1);
		convertedstring = sb.toString();
		
		Runtime rt1=Runtime.getRuntime();
		
		return convertedstring;
	}
}
