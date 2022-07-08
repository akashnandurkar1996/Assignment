package com.SpringCore.StudMap_10;

import java.security.KeyStore.Entry;
import java.util.Map;
import java.util.Set;

public class Student {
	
	private Map<String,Float> studdetails;
	
	
	
	
	public Map<String, Float> getStuddetails() {
		return studdetails;
	}


	public void setStuddetails(Map<String, Float> studdetails) {
		this.studdetails = studdetails;
	}


	public Student() {
		super();
	}


	public Student(Map<String, Float> studdetails) {
		super();
		this.studdetails = studdetails;
	}

	
	


	
	
}
