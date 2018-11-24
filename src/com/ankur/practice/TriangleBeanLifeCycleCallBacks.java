package com.ankur.practice;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TriangleBeanLifeCycleCallBacks implements InitializingBean,DisposableBean {
		//InitializingBean is a marker for TriangleBeanLifeCycle
		public Point pointA;
		public Point pointB;
		public Point pointC;
		public Point getPointA() {
			return pointA;
		}
		public void setPointA(Point pointA) {
			this.pointA = pointA;
		}
		public Point getPointB() {
			return pointB;
		}
		public void setPointB(Point pointB) {
			this.pointB = pointB;
		}
		public Point getPointC() {
			return pointC;
		}
		public void setPointC(Point pointC) {
			this.pointC = pointC;
		}
		
		public void draw(){
			System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
			System.out.println("Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
			System.out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");
		}
		
		@Override
		public void afterPropertiesSet() throws Exception { 
			// TODO Auto-generated method stub
			System.out.println("InitializingBean init method is called for TriangleBeanLifeCycleCallBacks");
		}
		@Override
		public void destroy() throws Exception {
			// TODO Auto-generated method stub
			System.out.println("Disposable bean destroy method has been called for the method");
		}
	}


