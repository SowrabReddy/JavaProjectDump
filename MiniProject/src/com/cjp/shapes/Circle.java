package com.cjp.shapes;

public class Circle extends Shape {

	final static double pi = 3.414;
	int r;

	public Circle(int r) {
		this.r = r;
	}

	public void getArea() {

		double area = pi * r * r;
		System.out.println("Area of circle is : " + area);
	}

	public void fillColour() {
		System.out.println("fill with sky blue");
	}

	public void getCircumference() {

		double circumference = 2 * pi * r;
		System.out.println("Circumference of circle is : " + circumference);
	}
}
