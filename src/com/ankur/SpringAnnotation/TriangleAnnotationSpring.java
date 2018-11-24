package com.ankur.SpringAnnotation;

import com.ankur.SpringAnnotation.PointForAnnotation;;

public class TriangleAnnotationSpring implements ShapeAnnotation {
	public PointForAnnotation pointAnnotationA;
	public PointForAnnotation pointAnnotationB;
	public PointForAnnotation pointAnnotationC;
	
	public PointForAnnotation getPointAnnotationC() {
		return pointAnnotationC;
	}

	public void setPointAnnotationC(PointForAnnotation pointAnnotationC) {
		this.pointAnnotationC = pointAnnotationC;
	}

	public PointForAnnotation getPointAnnotationA() {
		return pointAnnotationA;
	}

	public void setPointAnnotationA(PointForAnnotation pointAnnotationA) {
		this.pointAnnotationA = pointAnnotationA;
	}

	public PointForAnnotation getPointAnnotationB() {
		return pointAnnotationB;
	}

	public void setPointAnnotationB(PointForAnnotation pointAnnotationB) {
		this.pointAnnotationB = pointAnnotationB;
	}
	

	public void draw(){
		System.out.println("Drawing a triangle");
		System.out.println("Point A = (" + getPointAnnotationA().getX() + ", " + getPointAnnotationA().getY() + ")");
		System.out.println("Point B = (" + getPointAnnotationB().getX() + ", " + getPointAnnotationB().getY() + ")");
		System.out.println("Point C = (" + getPointAnnotationC().getX() + ", " + getPointAnnotationC().getY() + ")");
	}

}
