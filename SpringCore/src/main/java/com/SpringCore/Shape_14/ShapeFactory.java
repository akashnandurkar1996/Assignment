package com.SpringCore.Shape_14;

public class ShapeFactory  {
	
	//Factory methods returning objects of Each Class
	
	public static Circle getCircle() {
		return new Circle();
	}

	public static Rectangle getRectangle() {
		return new Rectangle();
	}
	
	public static Square getSquare(){

		return new Square();
	}
}
