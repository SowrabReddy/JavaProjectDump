package com.cjp.shapes;

public abstract class Triangle extends Shape {
	int b;
	int h;
	public Triangle(int b, int h) {
		this.b=b;
		this.h=h;
	}

	public void getArea() {
		double area = 0.5 * b * h;
		System.out.println("Area of triangle is : " + area);

	}

	

}
