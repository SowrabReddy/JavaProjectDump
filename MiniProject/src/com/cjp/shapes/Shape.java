package com.cjp.shapes;

abstract class Shape {
	public void rotate() {
		System.out.println("Rotate in clockwise direction");
	}
	
	abstract public void getArea();
	abstract public void fillColour();
}