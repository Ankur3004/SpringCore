package com.ankur.callingByInterface;

import com.ankur.callingByInterface.PointForInterface;;

public class Circle implements Shape {
	
	private PointForInterface center;
	
	public PointForInterface getCenter() {
		return center;
	}

	public void setCenter(PointForInterface center) {
		this.center = center;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a circle");
		System.out.println("Circle : Point is: (" + center.getX() + "," + center.getY() +")");
	}

}
