package com.yash.tdd.objectCloning_12;

public class ObjectCloning implements Cloneable {
	int id;
	String name;

	public ObjectCloning(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	
	public static boolean cloneCheck(ObjectCloning oc1,  ObjectCloning oc2 ) {
if (oc1.id==oc2.id && oc1.name==oc2.name)  
	return true;
else
	return false;

		
	}
}
