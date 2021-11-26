package com.cjp.utilities;

import com.cjp.shapes.Circle;
import com.cjp.shapes.EquilateralTriangle;
import com.cjp.shapes.LeftAngleTriangle;
import com.cjp.shapes.Rectangle;
import com.cjp.shapes.RightAngleTriangle;

public class DrawingApp {

	public static void main(String[] args) {
		
		System.out.println("Project starts.............");

		Circle circle = new Circle(6);
		circle.rotate();
		circle.fillColour();
		circle.getArea();
		circle.getCircumference();
		System.out.println("------Circle Ends-----------");
		
		Rectangle rect=new Rectangle(10, 12);
		rect.rotate();
		rect.fillColour();
		rect.getArea();
		rect.getPerimeter();
		System.out.println("------Rectangle Ends-----------");
		
		RightAngleTriangle rat=new RightAngleTriangle(7, 8);
		rat.rotate();
		rat.fillColour();
		rat.getArea();
		System.out.println("------Rightangle Triangle Ends-----------");
		
		LeftAngleTriangle lat=new LeftAngleTriangle(20, 21);
		lat.rotate();
		lat.fillColour();
		lat.getArea();
		System.out.println("------Leftangle Triangle Ends-----------");
		
		EquilateralTriangle equi=new EquilateralTriangle(5, 5);
		equi.rotate();
		equi.fillColour();
		equi.getArea();
		System.out.println("------Equilateral Triangle Ends-----------");
		

	}
}
