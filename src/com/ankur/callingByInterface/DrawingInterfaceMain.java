package com.ankur.callingByInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingInterfaceMain {

	
	public static void main(String args[]){
		
		/*
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringInterface.xml");
			TriangleInterfaceSpring triangleinterface = (TriangleInterfaceSpring)context.getBean("triangle");
			triangleinterface.draw();
			//for drawing a triangle.
		
		*/
		/*
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringInterface.xml");
			Circle circle = (Circle)context.getBean("circle");
			circle.draw();
		
		*/
		
		//In this bean call we are just calling the bean which we have to use rather that creating the object for required shape
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringInterface.xml");
		Shape shape = (Shape)context.getBean("triangle");
		shape.draw();
		
	}	

}
