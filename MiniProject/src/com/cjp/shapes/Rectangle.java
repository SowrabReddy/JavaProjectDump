package com.cjp.shapes;

public class Rectangle extends Shape {
	int l;
	int b;

	public Rectangle(int l, int b){
		this.l=l;
		this.b=b;
		
	}
	public void getArea() {
		int area = l * b;
		System.out.println("Area of rectangle is : " + area);

	}

	public void getPerimeter() {
		int perimeter = 2 * l * b;
		System.out.println("Perimeter of rectangle is : " + perimeter);

	}

	public void fillColour() {
		System.out.println("Rectanle colour is Greyish Yellow");
	}

}
