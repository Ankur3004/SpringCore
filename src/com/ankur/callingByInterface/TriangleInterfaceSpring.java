package com.ankur.callingByInterface;

import com.ankur.callingByInterface.PointForInterface;

public class TriangleInterfaceSpring implements Shape {
	public PointForInterface pointInterfaceA;
	public PointForInterface pointInterfaceB;
	public PointForInterface pointInterfaceC;

	public PointForInterface getPointInterfaceA() {
		return pointInterfaceA;
	}

	public void setPointInterfaceA(PointForInterface pointInterfaceA) {
		this.pointInterfaceA = pointInterfaceA;
	}

	public PointForInterface getPointInterfaceB() {
		return pointInterfaceB;
	}

	public void setPointInterfaceB(PointForInterface pointInterfaceB) {
		this.pointInterfaceB = pointInterfaceB;
	}

	public PointForInterface getPointInterfaceC() {
		return pointInterfaceC;
	}

	public void setPointInterfaceC(PointForInterface pointInterfaceC) {
		this.pointInterfaceC = pointInterfaceC;
	}

	public void draw(){
		System.out.println("Drawing a triangle");
		System.out.println("Point A = (" + getPointInterfaceA().getX() + ", " + getPointInterfaceA().getY() + ")");
		System.out.println("Point B = (" + getPointInterfaceB().getX() + ", " + getPointInterfaceB().getY() + ")");
		System.out.println("Point C = (" + getPointInterfaceC().getX() + ", " + getPointInterfaceC().getY() + ")");
	}
}
