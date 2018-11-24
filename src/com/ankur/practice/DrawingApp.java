package com.ankur.practice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String args[]){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("PostProcessor.xml");
		TrianglePP trianglepp = (TrianglePP)context.getBean("triangle");
		trianglepp.draw();
		
		
		
		
		
		
		//For inti and destroy method
		/*
		 * This object and draw method are used for SpringLifeCycleCallBacks
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("SpringLifeCycleCallBacks.xml"); 
		context.registerShutdownHook();
		TriangleBeanLifeCycleCallBacks trianglebean = (TriangleBeanLifeCycleCallBacks)context.getBean("triangle1");
		trianglebean.draw();
		*/
//		ApplicationContext context = new ClassPathXmlApplicationContext("BeanDefinitionInheritance.xml");
		/*BeanFactory factory = context;
		 * 
				Triangle apogee = new Triangle(); Creating an object of class in same package and calling a 
				method of the same class
				obj.draw();
		
		*/
//		Triangle triangle=(Triangle)context.getBean("triangle");this is for understanding the concepts of dependency injection
//		TriangleObjectInjection maintriangle =(TriangleObjectInjection)context.getBean("mainTriangle");for understanding constructor
		//injection 
//		TriangleObjectInjection maintriangle =(TriangleObjectInjection)context.getBean("triangle2"); 
//		for aliasing the bean
//		triangle.draw();
//				maintriangle.draw();
//		TriangleCollection triangleCollection = (TriangleCollection)context.getBean("triangleCollection");
//		triangleCollection.draw(); // used when we want to run the collection
//		TriangleAutoWiring triangleAutowiring = (TriangleAutoWiring)context.getBean("triangleAutowiring");
//		triangleAutowiring.draw();
		
	}
}
