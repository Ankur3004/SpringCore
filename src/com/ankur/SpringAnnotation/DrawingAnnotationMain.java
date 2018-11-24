package com.ankur.SpringAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingAnnotationMain {

	
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
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringAnnotation.xml");
		context.registerShutdownHook();
		ShapeAnnotation shape = (ShapeAnnotation)context.getBean("circleforannotation");
		shape.draw();
		
	}	

}
